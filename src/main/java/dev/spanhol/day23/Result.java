package dev.spanhol.day23;

import java.util.ArrayList;

public class Result {
    int count;
    boolean nameStartsWithT;
    ArrayList<Computer> computers;

    public Result(int count, boolean nameStartsWithT) {
        computers = new ArrayList<>();
        this.count = count;
        this.nameStartsWithT = nameStartsWithT;
    }

    @Override
    public String toString() {
        return "Result{" +
                "count=" + count +
                ", nameStartsWithT=" + nameStartsWithT +
                ", computers=" + computers +
                '}';
    }
}
