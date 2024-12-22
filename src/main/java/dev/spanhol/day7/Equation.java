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
            if (!solve(cursor, mul)) {
                return solve(cursor, add);
            } else {
                return true;
            }
        }
    }

    @Override
    public String toString() {
        return "Equation{" + "answer=" + total + ", values=" + values + '}';
    }
}
