package dev.spanhol.day16;

public class Point {
    int x;
    int y;
    Point up;
    Point right;
    Point down;
    Point left;
    boolean wall;
    boolean start;
    boolean end;
    int direction; //top, right, bottom, left -> 0,1,2,3
    Point cameFrom;
    int bestPathCost;
    boolean visited;


    public Point(int x, int y, char c) {
        this.x = x;
        this.y = y;
        if (c == '#') {
            wall = true;
        } else if (c == 'S') {
            start = true;
        } else if (c == 'E') {
            end = true;
        }
        this.direction = -1;
        this.cameFrom = null;
        this.bestPathCost = Integer.MAX_VALUE;
        this.visited = false;
    }

    public Point(int x, int y, Integer direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Point(int x, int y, Point cameFrom, int bestPathCost, Integer direction) {
        this.x = x;
        this.y = y;
        this.cameFrom = cameFrom;
        this.bestPathCost = bestPathCost;
        this.direction = direction;
    }

    public void setUp(Point up) {
        this.up = up;
    }

    public void setRight(Point right) {
        this.right = right;
    }

    public void setDown(Point down) {
        this.down = down;
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

    public char value(boolean noDirection) {
        if (wall) {
            return '#';
        }
        if (start) {
            return 'S';
        }
        if (end) {
            return 'E';
        }
        if (direction >= 0 && !noDirection && visited) {
            if (direction == 0) {
                return '^';
            }
            if (direction == 1) {
                return '>';
            }
            if (direction == 2) {
                return 'v';
            }
            if (direction == 3) {
                return '<';
            }
        }
        return '.';
    }


    public Integer getKey() {
        return x + (y * 1000);
    }

    public boolean samePlace(Point o) {
        return x == o.x && y == o.y;
    }

    @Override
    public String toString() {
        return x + "," + y + ":" + value(false) + " | " + bestPathCost;
    }
}
