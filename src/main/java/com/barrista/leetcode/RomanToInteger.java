package com.barrista.leetcode;

public class RomanToInteger {
  public int romanToInt(String s) {
    int result = 0;
    char[] romanNumerals = s.toCharArray();
    int[] arabicNumerals = new int[romanNumerals.length];
    for (int i = 0; i < romanNumerals.length; i++) {
      arabicNumerals[i] =
          switch (romanNumerals[i]) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
          };
    }
    for (int i = 0; i < arabicNumerals.length; i++) {
      if (i < arabicNumerals.length - 1 && arabicNumerals[i] < arabicNumerals[i + 1]) {
        result += arabicNumerals[i + 1] - arabicNumerals[i];
        i++;
      } else {
        result += arabicNumerals[i];
      }
    }
    return result;
  }
}
