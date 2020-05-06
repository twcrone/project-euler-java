package com.twcrone.projecteuler.practice;

public class IsUnique {

  public static void main(String[] args) {
    System.out.println(isUnique("ss"));
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
