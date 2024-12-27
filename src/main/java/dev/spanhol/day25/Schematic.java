package dev.spanhol.day25;

public class Schematic {
    int[] pins;
    boolean lock;

    public Schematic(int[] pins, boolean lock) {
        this.pins = pins;
        this.lock = lock;
    }

    public int compare(Schematic key) {
        for (int i = 0; i < pins.length; i++) {
            if (pins[i] + key.pins[i] > 5) {
                return 0;
            }
        }
        return 1;
    }
}
