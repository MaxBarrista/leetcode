package com.barrista.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {
  private final RomanToInteger solution = new RomanToInteger();

  @Test
  public void romanToInteger_IIIshouldReturnThree() {
    assertEquals(solution.romanToInt("III"), 3);
  }

  @Test
  public void romanToInteger_LVIIIshouldReturn58() {
    assertEquals(solution.romanToInt("LVIII"), 58);
  }

  @Test
  public void romanToInteger_MCMXCIVshouldReturn1994() {
    assertEquals(solution.romanToInt("MCMXCIV"), 1994);
  }
}
