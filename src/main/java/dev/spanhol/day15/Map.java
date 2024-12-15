package dev.spanhol.day15;

public class Map {

    char[][] charMap;
    Point[][] map;
    int height;
    int width;
    Point robot;


    public Map(String input, boolean large) {
        String[] lines = input.split("\n");
        height = lines.length;
        if (large) {
            width = lines[0].length() * 2;
        } else {
            width = lines[0].length();
        }
        char[][] newMap = new char[width][height];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width / 2; x++) {
                char c = lines[y].charAt(x);
                if (large) {
                    if (c == '@') {
                        newMap[x * 2][y] = c;
                        newMap[x * 2 + 1][y] = '.';
                    } else if (c == 'O') {
                        newMap[x * 2][y] = '[';
                        newMap[x * 2 + 1][y] = ']';
                    } else {
                        newMap[x * 2][y] = c;
                        newMap[x * 2 + 1][y] = c;
                    }
                } else {
                    newMap[x][y] = c;
                }
            }
        }
        this.charMap = newMap;
        this.map = new Point[width][height];
        robot = new Point(0, 0, '@');
        process();
    }

    private void process() {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                map[x][y] = new Point(x, y, charMap[x][y]);
                if (charMap[x][y] == '@') {
                    robot = map[x][y];
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

    public void moveRobot(char move) {
        move(robot, move);
    }

    public boolean move(Point here, char move) {
        if (move == '>') {
            if (here.getRight().free || (here.getRight().box && move(here.getRight(), move))) {
                doMove(here, here.getRight());
                return true;
            }
            if (here.getRight().wall) {
                return false;
            }
        }
        if (move == '<') {
            if (here.getLeft().free || (here.getLeft().box && move(here.getLeft(), move))) {
                doMove(here, here.getLeft());
                return true;
            }
            if (here.getLeft().wall) {
                return false;
            }
        }
        if (move == '^') {
            if (here.getUp().free || (here.getUp().box && move(here.getUp(), move))) {
                doMove(here, here.getUp());
                return true;
            }
            if (here.getUp().wall) {
                return false;
            }
        }
        if (move == 'v') {
            if (here.getDown().free || (here.getDown().box && move(here.getDown(), move))) {
                doMove(here, here.getDown());
                return true;
            }
            if (here.getDown().wall) {
                return false;
            }
        }
        return false;
    }

    public void doMove(Point here, Point next) {
        next.free = false;
        next.box = here.box;
        next.robot = here.robot;
        if (next.robot) {
            robot = next;
        }
        if (here.robot) {
            here.robot = false;
            here.free = true;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (robot.x == x && robot.y == y) {
                    sb.append(robot.value());
                } else {
                    sb.append(map[x][y].value());
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public int getGPSValue() {
        int gps = 0;
        for (Point[] points : map) {
            for (Point point : points) {
                gps += point.getGPSValue();
            }
        }
        return gps;
    }
}
