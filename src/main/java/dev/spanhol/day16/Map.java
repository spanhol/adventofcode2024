package dev.spanhol.day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Map {

    char[][] charMap;
    Point[][] map;
    HashMap<Integer, Point> walk;
    int height;
    int width;
    Point start;
    Point end;

    public Map(String input) {
        String[] lines = input.split("\n");
        height = lines.length;
        width = lines[0].length();
        char[][] newMap = new char[width][height];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                char c = lines[y].charAt(x);
                newMap[x][y] = c;
            }
        }
        this.charMap = newMap;
        this.map = new Point[width][height];
        this.walk = new HashMap<>();
        process();
        this.start.direction = 1;
    }

    private void process() {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                map[x][y] = new Point(x, y, charMap[x][y]);
                if (charMap[x][y] == 'S') {
                    start = map[x][y];
                }
                if (charMap[x][y] == 'E') {
                    end = map[x][y];
                }
            }
        }
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (x - 1 >= 0) {
                    map[x][y].setLeft(map[x - 1][y]);
                }
                if (x + 1 < width) {
                    map[x][y].setRight(map[x + 1][y]);
                }
                if (y - 1 >= 0) {
                    map[x][y].setUp(map[x][y - 1]);
                }
                if (y + 1 < height) {
                    map[x][y].setDown(map[x][y + 1]);
                }
            }
        }
    }

    public void astar() {
        this.start.bestPathCost = 0;
        this.start.cost = 0;
        Point bestPoint = this.start;

        List<Point> knownPoints = new ArrayList<>();
        while (!Objects.equals(bestPoint, end)) {
            bestPoint.visited = true;

            int lowestCost = Integer.MAX_VALUE;
            addKnowPoints(bestPoint, knownPoints);
            var l = knownPoints.stream().distinct().toList();
            knownPoints.clear();
            knownPoints.addAll(l);
            for (Point p : knownPoints) {
                int estCost = estimatedCost(p);
//                System.out.println(p + " :est: " + estCost);
                if (estCost < lowestCost) {
                    lowestCost = estCost;
                    bestPoint = p;
                }
            }
            if (bestPoint.direction != bestPoint.cameFrom.direction) {
                System.out.println(this);
                System.out.println();
//                System.out.println(knownPoints);
            }
            System.out.println("Visiting: " + bestPoint);
            System.out.println("\n");
        }

        System.out.println("bestPoint: " + bestPoint);
        Point prev = bestPoint;
        while (prev != null) {
            walk.put(prev.getKey(), prev);
            prev = prev.cameFrom;
            System.out.println("prev: " + prev);
        }
        System.out.println(finalPathToString());
    }

    public void addKnowPoints(Point current, List<Point> knownPoints) {
        addKnowPointFromDirection(current, current.up, knownPoints, 0);
        addKnowPointFromDirection(current, current.right, knownPoints, 1);
        addKnowPointFromDirection(current, current.down, knownPoints, 2);
        addKnowPointFromDirection(current, current.left, knownPoints, 3);
        knownPoints.remove(current);
    }

    public void addKnowPointFromDirection(Point current, Point target, List<Point> knownPoints, int direction) {
        if (!target.wall && current.direction != (direction + 2) % 4) {
            if (!target.visited) {
                knownPoints.add(target);
            }
            int cost = 1 + current.bestPathCost;
            if (current.direction != direction) {
                cost = 1001 + current.bestPathCost;
            }
            if (cost < target.bestPathCost) {
                if (current.direction != direction) {
                    target.cost = 1001;
                }
                target.direction = direction;
                target.bestPathCost = cost;
                target.cameFrom = current;
//                System.out.println("calculated: " + target);
            }
        }
    }

    public int estimatedCost(Point current) {
        int cost = current.bestPathCost;
        int x = Math.abs(current.x - end.x);
        int y = Math.abs(current.y - end.y);
        return cost + ((x + y) * 200);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int y = 0; y < height; y++) {
            if (y < 100) {
                sb.append('0');
            }
            if (y < 10) {
                sb.append('0');
            }
            sb.append(y).append(" ");
            for (int x = 0; x < width; x++) {
                sb.append(map[x][y].value(false));
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public String finalPathToString() {
        StringBuilder sb = new StringBuilder();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                var path = walk.get(map[x][y].getKey());
                if (path != null) {
                    sb.append(path.value(false));
                } else {
                    sb.append(map[x][y].value(true));
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
