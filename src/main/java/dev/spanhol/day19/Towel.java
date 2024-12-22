package dev.spanhol.day19;

public class Towel {
    String colors;
    char firstChar;

    public Towel(String colors) {
        this.colors = colors;
        this.firstChar = colors.charAt(0);
    }

    public Node getNewNode() {
        return new Node(colors);
    }

    @Override
    public String toString() {
        return colors;
    }
}
