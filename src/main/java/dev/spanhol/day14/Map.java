package dev.spanhol.day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Map {

    Point[][] map;
    int width;
    int height;
    ArrayList<Robot> robots;

    public Map(int width, int height) {
        this.width = width;
        this.height = height;
        this.map = new Point[width][height];
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                map[x][y] = new Point(x, y);
            }
        }
        robots = new ArrayList<>();
    }

    public Point[][] getMap() {
        return map;
    }

    public void setMap(Point[][] map) {
        this.map = map;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public ArrayList<Robot> getRobots() {
        return robots;
    }

    public void setRobots(ArrayList<Robot> robots) {
        this.robots = robots;
        for (Robot robot : robots) {
            map[robot.x][robot.y].getRobots().add(robot);
        }
    }

    @Override
    public String toString() {
        StringBuilder m = new StringBuilder();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (map[x][y].getRobots().isEmpty()) {
                    m.append(".");
                } else {
                    m.append(map[x][y].getRobots().size());
                }
            }
            m.append("\n");
        }

        m.append("\n");
        return m.toString();
    }

    public void moveRobots() {
        //calculate movement
        for (Robot robot : robots) {
            int newX = robot.x + robot.velX;
            int newY = robot.y + robot.velY;
            if (newX < 0) {
                newX = newX + width;
            }
            if (newY < 0) {
                newY = newY + height;
            }
            if (newX > width - 1) {
                newX = newX - width;
            }
            if (newY > height - 1) {
                newY = newY - height;
            }
            robot.moveTo(newX, newY);
        }
        //clear and reset
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                map[x][y].getRobots().clear();
            }
        }
        for (Robot robot : robots) {
            map[robot.x][robot.y].getRobots().add(robot);
        }
    }

    public int safetyFactor() {
        int safetyFactor = 0;

        int q1xborder = (width - 1) / 2;
        int q1yborder = (height - 1) / 2;
        int q1Sf = 0;

        for (int x = 0; x < q1xborder; x++) {
            for (int y = 0; y < q1yborder; y++) {
                q1Sf += map[x][y].getRobots().size();
            }
        }

        int q2xborder = (width / 2) + 1;
        int q2yborder = (height - 1) / 2;
        int q2Sf = 0;

        for (int x = q2xborder; x < width; x++) {
            for (int y = 0; y < q2yborder; y++) {
                q2Sf += map[x][y].getRobots().size();
            }
        }

        int q3xborder = (width - 1) / 2;
        int q3yborder = (height / 2) + 1;
        int q3Sf = 0;

        for (int x = 0; x < q3xborder; x++) {
            for (int y = q3yborder; y < height; y++) {
                q3Sf += map[x][y].getRobots().size();
            }
        }

        int q4xborder = (width / 2) + 1;
        int q4yborder = (height / 2) + 1;
        int q4Sf = 0;

        for (int x = q4xborder; x < width; x++) {
            for (int y = q4yborder; y < height; y++) {
                q4Sf += map[x][y].getRobots().size();
            }
        }


        safetyFactor += q1Sf * q2Sf * q3Sf * q4Sf;
        return safetyFactor;
    }
}
