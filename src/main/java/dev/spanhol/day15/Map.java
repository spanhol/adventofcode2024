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
        int transformedWidth = width;
        if (large) {
            transformedWidth = width / 2;
        }
        char[][] newMap = new char[width][height];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < transformedWidth; x++) {
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

    public boolean verifyMoveRobot(char move) {
        return move(robot, move, false);
    }

    public void moveRobot(char move) {
        move(robot, move, true);
    }

    public boolean move(Point here, char move, boolean doMove) {
        if (move == '>') {
            if (here.right.wall) {
                return false;
            }
            if (here.right.free || move(here.right, move, doMove)) {
                if (doMove) {
                    doMove(here, here.right);
                }
                return true;
            }
        }
        if (move == '<') {
            if (here.left.wall) {
                return false;
            }
            if (here.left.free || move(here.left, move, doMove)) {
                if (doMove) {
                    doMove(here, here.left);
                }
                return true;
            }
        }
        if (move == '^') {
            if (here.up.wall) {
                return false;
            }
            if (here.bigBoxleft || here.bigBoxRight) {
                if (here.bigBoxleft) {
                    if (here.up.right.wall) {
                        return false;
                    }
                    if ((here.up.free || move(here.up, move, doMove))
                            && (here.up.right.free || move(here.up.right, move, doMove))) {
                        if (doMove) {
                            doMove(here, here.up);
                            doMove(here.right, here.up.right);
                        }
                        return true;
                    }
                } else {
                    if (here.up.left.wall) {
                        return false;
                    }
                    if ((here.up.free || move(here.up, move, doMove))
                            && (here.up.left.free || move(here.up.left, move, doMove))) {
                        if (doMove) {
                            doMove(here, here.up);
                            doMove(here.left, here.up.left);
                        }
                        return true;
                    }
                }
            } else {
                if (here.up.free || (move(here.up, move, doMove))) {
                    if (doMove) {
                        doMove(here, here.up);
                    }
                    return true;
                }
            }
        }
        if (move == 'v') {
            if (here.down.wall) {
                return false;
            }
            if (here.bigBoxleft || here.bigBoxRight) {
                if (here.bigBoxleft) {
                    if (here.down.right.wall) {
                        return false;
                    }
                    if ((here.down.free || move(here.down, move, doMove))
                            && (here.down.right.free || move(here.down.right, move, doMove))) {
                        if (doMove) {
                            doMove(here, here.down);
                            doMove(here.right, here.down.right);
                        }
                        return true;
                    }
                } else {
                    if (here.down.left.wall) {
                        return false;
                    }
                    if ((here.down.free || move(here.down, move, doMove))
                            && (here.down.left.free || move(here.down.left, move, doMove))) {
                        if (doMove) {
                            doMove(here, here.down);
                            doMove(here.left, here.down.left);
                        }
                        return true;
                    }
                }
            } else {
                if (here.down.free || (move(here.down, move, doMove))) {
                    if (doMove) {
                        doMove(here, here.down);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public void doMove(Point here, Point next) {
        next.free = false;
        next.box = here.box;
        next.bigBoxleft = here.bigBoxleft;
        next.bigBoxRight = here.bigBoxRight;
        next.robot = here.robot;
        if (next.robot) {
            robot = next;
        }
        here.free = true;
        here.robot = false;
        here.box = false;
        here.bigBoxleft = false;
        here.bigBoxRight = false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                sb.append(map[x][y].value());
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
