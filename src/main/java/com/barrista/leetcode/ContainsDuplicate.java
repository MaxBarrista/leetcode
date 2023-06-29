package com.barrista.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numsSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return numsSet.size() != nums.length;
    }

    // Better solution
    // TODO
}
