package dev.spanhol.day23;

import java.util.ArrayList;
import java.util.Comparator;

public class Tri {
    ArrayList<Computer> computers;

    public Tri(Computer a, Computer b, Computer c) {
        computers = new ArrayList<>();
        computers.add(a);
        computers.add(b);
        computers.add(c);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tri tri = (Tri) o;
        if (computers.size() != tri.computers.size()) {
            return false;
        }
        for (Computer o1 : computers) {
            boolean found = false;
            for (Computer o2 : tri.computers) {
                if (o1.equals(o2)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    public String geyKey() {
        StringBuilder code = new StringBuilder();
        computers.sort(Comparator.comparing(o -> o.name));
        for (Computer o : computers) {
            code.append(o.name);
        }
        return code.toString();
    }

    @Override
    public String toString() {
        return "Tri{" + computers + '}';
    }
}
