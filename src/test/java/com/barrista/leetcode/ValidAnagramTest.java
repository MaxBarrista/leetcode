package com.barrista.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {
    ValidAnagram solution = new ValidAnagram();
    @Test
    void givenAnagramAndNagaram_whenIsAnagram_thenReturnTrue() {
        assertTrue(solution.isAnagram("anagram", "nagaram"));
    }

    @Test
    void givenCatAndRat_whenIsAnagram_thenReturnFalse() {
        assertFalse(solution.isAnagram("cat", "rat"));
    }

    @Test
    void givenCAndRat_whenIsAnagram_thenReturnFalse() {
        assertFalse(solution.isAnagram("c", "rat"));
    }

    @Test
    void givenAAndB_whenIsAnagram_thenReturnFalse() {
        assertFalse(solution.isAnagram("a", "b"));
    }
}