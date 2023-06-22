package com.barrista.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
  public boolean isValid(String s) {
    char[] sArr = s.toCharArray();
      Deque<Integer> stack = new ArrayDeque<>();
      for (char c : sArr) {
          switch (c) {
              case '(' -> stack.push(1);
              case '{' -> stack.push(2);
              case '[' -> stack.push(3);
              case ')' -> {
                  if (stack.isEmpty() || 1 != stack.pop()) {
                      return false;
                  }
              }
              case '}' -> {
                  if (stack.isEmpty() || 2 != stack.pop()) {
                      return false;
                  }
              }
              case ']' -> {
                  if (stack.isEmpty() || 3 != stack.pop()) {
                      return false;
                  }
              }
          }
      }
    return stack.isEmpty();
  }
}
