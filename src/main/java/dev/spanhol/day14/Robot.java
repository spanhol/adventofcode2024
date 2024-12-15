package dev.spanhol.day14;

public class Robot {
    int x;
    int y;
    int velX;
    int velY;

    public Robot(int x, int y, int velX, int velY) {
        this.x = x;
        this.y = y;
        this.velX = velX;
        this.velY = velY;
    }

    @Override
    public String toString() {
        return "p=" + x + "," + y + " v=" + velX + "," + velY;
    }

    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
