package com.barrista.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new ArrayList<>(numRows);

    for (int i = 0; i < numRows; i++) {
      result.add(new ArrayList<>(i + 1));
      List<Integer> integers = result.get(i);
      integers.add(1);
      for (int j = 1; j < i + 1; j++) {

        List<Integer> previousRow = result.get(i - 1);
        integers.add(previousRow.get(j - 1) + (j == i ? 0 : previousRow.get(j)));
      }
    }
    return result;
  }
}
