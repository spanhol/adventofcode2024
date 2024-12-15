package dev.spanhol.day13;

public class ClawMachine {
    int x;
    int y;
    int tokenCost;
    int aPresses;
    int bPresses;
    int aX;
    int aY;
    int bX;
    int bY;
    int prizeX;
    int prizeY;
    int aTokenCost = 3;
    int bTokenCost = 1;

    public ClawMachine(int aX, int aY, int bX, int bY, int prizeX, int prizeY) {
        this.x = 0;
        this.y = 0;
        this.tokenCost = 0;
        this.aPresses = 0;
        this.bPresses = 0;
        this.aX = aX;
        this.aY = aY;
        this.bX = bX;
        this.bY = bY;
        this.prizeX = prizeX;
        this.prizeY = prizeY;
    }

    public void pushA() {
        aPresses++;
        update();
    }

    public void pushB() {
        bPresses++;
        update();
    }

    public void reset() {
        this.x = 0;
        this.y = 0;
        this.tokenCost = 0;
        this.aPresses = 0;
        this.bPresses = 0;
    }

    public int getTokenCost() {
        return tokenCost;
    }

    public void setaPresses(int aPresses) {
        this.aPresses = aPresses;
        update();
    }

    public void setbPresses(int bPresses) {
        this.bPresses = bPresses;
        update();
    }

    private void update() {
        this.x = aPresses * aX + bPresses * bX;
        this.y = aPresses * aY + bPresses * bY;
        this.tokenCost = (aPresses * aTokenCost) + (bPresses * bTokenCost);
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

    public int getaPresses() {
        return aPresses;
    }

    public int getbPresses() {
        return bPresses;
    }

    public int getaX() {
        return aX;
    }

    public int getaY() {
        return aY;
    }

    public int getbX() {
        return bX;
    }

    public int getbY() {
        return bY;
    }

    public int getPrizeX() {
        return prizeX;
    }

    public int getPrizeY() {
        return prizeY;
    }

    public int getXDistanceToPrize() {
        return this.x - this.prizeX;
    }

    public int getYDistanceToPrize() {
        return this.y - this.prizeY;
    }

    @Override
    public String toString() {
        return "ClawMachine{" +
                "x=" + x +
                ", distX=" + getXDistanceToPrize() +
                ", y=" + y +
                ", distY=" + getYDistanceToPrize() +
                ", aPresses=" + aPresses +
                ", bPresses=" + bPresses +
                ", aX=" + aX +
                ", aY=" + aY +
                ", bX=" + bX +
                ", bY=" + bY +
                ", prizeX=" + prizeX +
                ", prizeY=" + prizeY +
                '}';
    }
}
