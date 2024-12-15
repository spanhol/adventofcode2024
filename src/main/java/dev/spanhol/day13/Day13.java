package dev.spanhol.day13;

import java.util.ArrayList;

public class Day13 {
    String input = "";
    ArrayList<ClawMachine> clawMachines = new ArrayList<>();

    public void read() {
        String[] lines = input.split("\n");
        for (int i = 0; i < lines.length; i += 4) {
            int buttonAx = Integer.parseInt(lines[i].substring(lines[i].indexOf("X+") + 1, lines[i].indexOf(", Y")));
            int buttonAy = Integer.parseInt(lines[i].substring(lines[i].indexOf("Y+") + 1));
            int buttonBx = Integer.parseInt(lines[i + 1].substring(lines[i + 1].indexOf("X+") + 1, lines[i + 1].indexOf(", Y")));
            int buttonBy = Integer.parseInt(lines[i + 1].substring(lines[i + 1].indexOf("Y+") + 1));
            int prizeX = Integer.parseInt(lines[i + 2].substring(lines[i + 2].indexOf("X=") + 2, lines[i].indexOf(", Y") - 1));
            int prizeY = Integer.parseInt(lines[i + 2].substring(lines[i + 2].indexOf("Y=") + 2));
            ClawMachine claw = new ClawMachine(buttonAx, buttonAy, buttonBx, buttonBy, prizeX, prizeY);
            clawMachines.add(claw);
        }

    }

    public void part1() {
        input = "Button A: X+17, Y+86\n" +
                "Button B: X+84, Y+37\n" +
                "Prize: X=7870, Y=6450";
        read();

        ClawMachine c = clawMachines.get(0);
        c.reset();
        boolean valid = false;

        int rateAx = c.aX / 3;
        int rateAy = c.aY / 3;
        boolean aXRateIsBigger = rateAx > c.bX;
        boolean aYRateIsBigger = rateAy > c.bY;

        //start at a random number of presses
        int apress = 50;
        int bpress = 50;
        c.setaPresses(apress);
        c.setbPresses(bpress);

        while (!valid) {
            System.out.println(c);
            if (c.getXDistanceToPrize() == 0 && c.getYDistanceToPrize() == 0) {
                valid = true;
                break;
            }
            if (c.getXDistanceToPrize() > 0) {
                if (aXRateIsBigger) {
                    apress--;
                    c.setaPresses(apress);
                } else {
                    bpress--;
                    c.setbPresses(bpress);
                }
            } else if (c.getXDistanceToPrize() < 0) {
                if (aXRateIsBigger) {
                    apress++;
                    c.setaPresses(apress);
                } else {
                    bpress++;
                    c.setbPresses(bpress);
                }
            }
            if (c.getYDistanceToPrize() > 0) {
                if (aYRateIsBigger) {
                    apress--;
                    c.setaPresses(apress);
                } else {
                    bpress--;
                    c.setbPresses(bpress);
                }
            } else if (c.getYDistanceToPrize() < 0) {
                if (aYRateIsBigger) {
                    apress++;
                    c.setaPresses(apress);
                } else {
                    bpress++;
                    c.setbPresses(bpress);
                }
            }
        }

        System.out.println();
    }


    public void part2() {

    }
}
