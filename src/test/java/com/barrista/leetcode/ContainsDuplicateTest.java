package com.barrista.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContainsDuplicateTest {
    ContainsDuplicate solution = new ContainsDuplicate();
    @Test
    public void nums1231ShouldReturnTrue() {
        assertTrue(solution.containsDuplicate(new int[]{1, 2, 3, 1}));
    }

    @Test
    public void nums1234ShouldReturnFalse() {
        assertFalse(solution.containsDuplicate(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void nums1113343242ShouldReturnTrue() {
        assertTrue(solution.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
}
