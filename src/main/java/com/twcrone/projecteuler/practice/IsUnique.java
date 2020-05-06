package com.twcrone.projecteuler.practice;

import java.util.Random;

public class IsUnique {

  public static void main(String[] args) {
    var random = new Random(System.currentTimeMillis()).nextInt(10);
    System.out.println(random);
    System.out.println(isUnique(Integer.toString(random)));
  }

  private static boolean isUnique(String s) {
    for(int i = 0; i < s.length(); i++) {
      for(int j = i + 1; j < s.length(); j++) {
        if(s.charAt(i) == s.charAt(j)) {
          return false;
        }
      }
    }
    return true;
  }
}
