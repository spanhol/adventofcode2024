package dev.spanhol;

import dev.spanhol.Five.Five;
import dev.spanhol.four.Four;
import dev.spanhol.one.One;
import dev.spanhol.three.Three;
import dev.spanhol.two.Two;

public class Main {
    public static void main(String[] args) {
        One one = new One();
        one.part1();
        one.part2();
        Two two = new Two();
        two.part1();
        two.part2();
        Three three = new Three();
        three.part1();
        three.part2();
        Four four = new Four();
        four.part1();
        four.part2();
        Five five = new Five();
        five.part1();
        five.part2();
    }
}