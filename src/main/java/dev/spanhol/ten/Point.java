package dev.spanhol.ten;

public class Point {
    int x;
    int y;
    int heght;
    boolean visited;
    int ratting;
    Point up;
    Point right;
    Point down;
    Point left;

    public Point(int x, int y, int heght) {
        this.x = x;
        this.y = y;
        this.heght = heght;
        this.visited = false;
        this.ratting = 0;
    }

    public int getRatting() {
        return ratting;
    }

    public void setRatting(int ratting) {
        this.ratting = ratting;
    }

    public boolean acessible(Point other) {
        return other.getHeght() - 1 == heght;
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

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public int getHeght() {
        return heght;
    }

    public void setHeght(int heght) {
        this.heght = heght;
    }
}
