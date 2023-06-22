package com.barrista.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Designations in test method name:
 *
 * <p>1o = (
 *
 * <p>1c = )
 *
 * <p>2o = {
 *
 * <p>2c = }
 *
 * <p>3o = [
 *
 * <p>3c = ]
 */
class ValidParenthesesTest {
  ValidParentheses solution = new ValidParentheses();

  @Test
  void str1o1cShouldReturnTrue() {
    assertTrue(solution.isValid("()"));
  }

  @Test
  void str1o1c3o3c2o2cShouldReturnTrue() {
    assertTrue(solution.isValid("()[]{}"));
  }

  @Test
  void str1o3cShouldReturnFalse() {
    assertFalse(solution.isValid("(]"));
  }

  @Test
  void str1o3o2o2c1c3cShouldReturnFalse() {
    assertFalse(solution.isValid("([{})]"));
  }

  @Test
  void str1oShouldReturnFalse() {
    assertFalse(solution.isValid("("));
  }

  @Test
  void str3cShouldReturnFalse() {
    assertFalse(solution.isValid("]"));
  }
}
