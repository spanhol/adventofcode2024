package dev.spanhol.day23;

import java.util.ArrayList;

public class Computer {
    String name;
    boolean visited;
    ArrayList<Computer> conections;

    public Computer(String name) {
        this.name = name;
        visited = false;
        conections = new ArrayList<>();
    }

    @Override
    public String toString() {
        return name;
    }

    public String fullString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(", c: ");
        for (Computer conection : conections) {
            sb.append(",").append(conection.simplified());
        }
        sb.append("}");
        return sb.toString();
    }

    public String simplified() {
        return name;
    }
}
