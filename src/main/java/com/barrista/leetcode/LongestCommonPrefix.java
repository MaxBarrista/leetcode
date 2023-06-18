package com.barrista.leetcode;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        // flow, flower
        int minLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            System.out.println("1");
            if (strs[i].length() < minLength) {
                minLength = strs[i].length();
            }
        }
        if (minLength == 0) {
            return "";
        }
        for(int i = 1; i <= minLength; i++) {
            // Get first i letters of the first word to compare to
            prefix = strs[0].substring(0, i);
            for(int j = 1; j < strs.length; j++) {
                if (!strs[j].substring(0, i).equals(prefix)) {
                    return prefix.substring(0, prefix.length() - 1);
                }
            }
        }
        return prefix;
    }
}
