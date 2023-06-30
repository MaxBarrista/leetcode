package com.barrista.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] chars = s.toCharArray();
        List<Character> sList = new ArrayList<>(chars.length);
        for(char c : chars) {
            sList.add(c);
        }

        chars = t.toCharArray();
        for (char c : chars) {
            if (!sList.remove(Character.valueOf(c))) {
                return false;
            }
        }
        return sList.size() == 0;
    }
}
