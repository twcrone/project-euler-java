package com.twcrone.projecteuler.practice;

public class StringCompression {

  public static void main(String[] args) {
    System.out.println(compress("abccccbbbnnhuuuaaxcv"));
  }

  private static String compress(String s) {
    int size = s.length();
    StringBuilder sb = new StringBuilder();
    int i = 0;
    while(i < size) {
      char a = s.charAt(i);
      int count = 1;
      int j = i + 1;
      while(j < size && a == s.charAt(j)) {
        count++;
        j++;
      }
      sb.append(a).append(count);
      i = j;
    }
    var compressed = sb.toString();
    System.out.println(compressed);
    return compressed.length() < size ? compressed : s;
  }
}
