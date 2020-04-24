package com.twcrone.projecteuler;

import com.twcrone.projecteuler.solution.MultiplesOfThreeAndFive;

public class App {
  public static void main(String[] args) {
    var solution = new MultiplesOfThreeAndFive().solveFor(1000);
    System.out.println("Problem 1 solution is " + solution);
  }
}
