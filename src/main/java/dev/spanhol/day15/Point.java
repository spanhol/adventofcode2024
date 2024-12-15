package dev.spanhol.day15;

public class Point {
    int x;
    int y;
    Point up;
    Point right;
    Point down;
    Point left;
    boolean box;
    boolean wall;
    boolean robot;
    boolean free;

    public Point(int x, int y, char c) {
        this.x = x;
        this.y = y;
        if (c == '#') {
            wall = true;
        } else if (c == 'O') {
            box = true;
        } else if (c == '@') {
            robot = true;
        } else {
            free = true;
        }
    }


    public Point getUp() {
        return up;
    }

    public void setUp(Point up) {
        this.up = up;
    }

    public Point getRight() {
        return right;
    }

    public void setRight(Point right) {
        this.right = right;
    }

    public Point getDown() {
        return down;
    }

    public void setDown(Point down) {
        this.down = down;
    }

    public Point getLeft() {
        return left;
    }

    public void setLeft(Point left) {
        this.left = left;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char value() {
        if (wall) {
            return '#';
        }
        if (box) {
            return 'O';
        }
        if (robot) {
            return '@';
        }
        return '.';
    }

    public int getGPSValue() {
        int gps = 0;
        if (box) {
            gps = y * 100 + x;
        }
        return gps;
    }
}
