package dev.spanhol.day23;

import java.util.ArrayList;
import java.util.Comparator;

public class Result {
    int count;
    Computer root;
    ArrayList<Computer> computers;

    public Result(Computer root, int count) {
        computers = new ArrayList<>();
        this.root = root;
        this.count = count;
    }

    public String geyKey() {
        StringBuilder code = new StringBuilder();
        computers.sort(Comparator.comparing(o -> o.name));
        for (Computer o : computers) {
            code.append(o.name).append(",");
        }
        return code.substring(0, code.length() - 1);
    }

    @Override
    public String toString() {
        return "Result{" +
                "count=" + count +
                ", computers=" + computers +
                '}';
    }
}
