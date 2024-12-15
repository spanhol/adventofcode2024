package dev.spanhol.day14;

import java.util.ArrayList;

public class Point {
    int x;
    int y;
    ArrayList<Robot> robots;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        robots = new ArrayList<>();
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

    public ArrayList<Robot> getRobots() {
        return robots;
    }
}
