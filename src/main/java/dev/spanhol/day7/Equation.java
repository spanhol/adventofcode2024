package dev.spanhol.day7;

import java.math.BigInteger;
import java.util.ArrayList;

public class Equation {
    BigInteger total;
    ArrayList<BigInteger> values;

    public Equation(BigInteger Integer, ArrayList<BigInteger> values) {
        this.total = Integer;
        this.values = values;
    }

    public boolean solvable() {
        BigInteger runningTotal = values.getFirst();
        return solve(1, runningTotal);
    }

    private boolean solve(int cursor, BigInteger runningTotal) {
        if (runningTotal.compareTo(total) > 0) {
            return false;
        }
        BigInteger mul = runningTotal.multiply(values.get(cursor));
        BigInteger add = runningTotal.add(values.get(cursor));
        if (cursor + 1 == values.size()) {
            return mul.equals(total) || add.equals(total);
        } else {
            cursor++;
            return solve(cursor, mul) || solve(cursor, add);
        }
    }

    public boolean solvable2() {
        BigInteger runningTotal = values.getFirst();
        return solve2(1, runningTotal);
    }

    private boolean solve2(int cursor, BigInteger runningTotal) {
        if (runningTotal.compareTo(total) > 0) {
            return false;
        }
        BigInteger mul = runningTotal.multiply(values.get(cursor));
        BigInteger add = runningTotal.add(values.get(cursor));
        BigInteger concat = new BigInteger(runningTotal + values.get(cursor).toString());
        if (cursor + 1 == values.size()) {
            return mul.equals(total) || add.equals(total) || concat.equals(total);
        } else {
            cursor++;
            return solve2(cursor, mul) || solve2(cursor, add) || solve2(cursor, concat);
        }
    }

    @Override
    public String toString() {
        return "Equation{" + "answer=" + total + ", values=" + values + '}';
    }
}
