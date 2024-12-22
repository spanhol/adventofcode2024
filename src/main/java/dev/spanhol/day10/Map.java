package dev.spanhol.day10;

import java.util.ArrayList;
import java.util.Stack;

public class Map {

    int[][] intMap;
    Point[][] map;
    int height;
    int width;
    ArrayList<Point> trailHeads;
    ArrayList<Point> possibleTrailEnds;
    ArrayList<Point> trailEnds;

    public Map(String input) {
        trailEnds = new ArrayList<>();
        String[] lines = input.split("\n");
        height = lines.length;
        width = lines[0].length();
        int[][] newMap = new int[width][height];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                newMap[x][y] = Integer.parseInt(lines[y].substring(x, x + 1));
            }
        }
        this.intMap = newMap;
        this.map = new Point[height][width];
        processTrails();
    }

    private void processTrails() {
        trailHeads = new ArrayList<>();
        possibleTrailEnds = new ArrayList<>();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                map[x][y] = new Point(x, y, intMap[x][y]);
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
                if (intMap[x][y] == 0) {
                    trailHeads.add(map[x][y]);
                }
                if (intMap[x][y] == 9) {
                    possibleTrailEnds.add(map[x][y]);
                }
            }
        }
    }


    public void findTrails() {
        for (Point trailHead : trailHeads) {
            for (Point possibleTrailEnd : possibleTrailEnds) {
                possibleTrailEnd.setVisited(false);
            }
            findTrailsFromHead(trailHead);
        }
    }

    public void findTrailsRattings() {
        for (Point trailHead : trailHeads) {
            findTrailsFromHead(trailHead);
        }
    }

    private void findTrailsFromHead(Point trailHead) {
        Stack<Point> stack = new Stack<>();
        stack.push(trailHead);
        Point here = null;
        while (!stack.isEmpty()) {
            here = stack.pop();
//            System.out.println("P: " + here.x + "," + here.y + "  " + here.heght);
//            for (int y = 0; y < height; y++) {
//                for (int x = 0; x < width; x++) {
//                    if (x == here.getX() && y == here.getY()) {
//                        System.out.print("H");
//                    } else {
//                        System.out.print(map[x][y].getHeght());
//                    }
//                }
//                System.out.println();
//            }
//            System.out.println("\n\n");
            if (here.getHeght() == 9) {
                trailEnds.add(here);
                trailHead.setRatting(trailHead.getRatting() + 1);
            }
            if (here.getUp() != null && here.acessible(here.getUp())) {
                stack.push(here.getUp());
            }
            if (here.getRight() != null && here.acessible(here.getRight())) {
                stack.push(here.getRight());
            }
            if (here.getDown() != null && here.acessible(here.getDown())) {
                stack.push(here.getDown());
            }
            if (here.getLeft() != null && here.acessible(here.getLeft())) {
                stack.push(here.getLeft());
            }
        }
    }

    public ArrayList<Point> getTrailEnds() {
        return trailEnds;
    }

    public int getTrailRattings() {
        int sum = 0;
        for (Point trailHead : trailHeads) {
            sum += trailHead.getRatting();
        }
        return sum;
    }
}
