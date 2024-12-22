package dev.spanhol.day19;

import java.util.Arrays;

public class Node {
    char[] colors;
    Integer distanceToFinish;
    Integer weight;
    boolean completes;
    private int position;
    int nextPosition;
    int length;
    boolean valid;

    public Node(String colors) {
        this.colors = colors.toCharArray();
        distanceToFinish = Integer.MAX_VALUE;
        length = colors.length();
        nextPosition = position + length;
        weight = 0;
        completes = false;
        valid = true;
    }

    public void setDistanceToFinish(Integer distance) {
        this.distanceToFinish = distance;
    }

    public void setPosition(int position) {
        this.position = position;
        nextPosition = position + length;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Node{" +
                "distance=" + distanceToFinish +
                ", colors=" + asString() +
                '}';
    }

    public String asString() {
        StringBuilder sb = new StringBuilder();
        for (char color : colors) {
            sb.append(color);
        }
        return sb.toString();
    }
}
