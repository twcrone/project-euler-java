package com.twcrone.projecteuler.solution;

public class MultiplesOfThreeAndFive {
    public long solveFor(long n) {
        int sum = 0;
        for(int i = 1; i < n; i++) {
            if(isMultipleOfThreeOrFive(i)) {
                sum += i;
            }
        }
        return sum;
    }

    private static boolean isMultipleOfThreeOrFive(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }
}
