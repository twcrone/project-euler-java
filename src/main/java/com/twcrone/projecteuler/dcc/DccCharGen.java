package com.twcrone.projecteuler.dcc;

import java.util.Random;

public class DccCharGen {

    private static final long seed = System.currentTimeMillis();
    private static final Random random = new Random(seed);

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            generateCharacter();
            System.out.println();
        }
    }

    private static void generateCharacter() {
        int[] stats = new int[6];
        for(int i = 0; i < 6; i++) {
            stats[i] = rollStat(6);
        }
        printStat("Strength", stats[0]);
        printStat("Agility", stats[1]);
        printStat("Stamina", stats[2]);
        printStat("Personality", stats[3]);
        printStat("Intelligence", stats[4]);
        printStat("Luck", stats[5]);
        printStat("Luck Mod", rollStat(30, 1));
        printStat("HP", rollStat(4, 1));
        printStat("Copper", rollStat(12, 5));
        printStat("Occupation", rollStat(100, 1));
        printStat("Item", rollStat(24, 1));
    }

    private static void printStat(String stat, int value) {
        System.out.println(stat + "=" + value);
    }

    private static int rollStat(int sides) {
        return rollStat(sides, 3);
    }

    private static int rollStat(int sides, int times) {
        var stat = 0;
        for(var i = 0; i < times; i++) {
            var roll = random.nextInt(sides) + 1;
            //System.out.println(roll);
            stat += roll;
        }

        return stat;
    }
}
