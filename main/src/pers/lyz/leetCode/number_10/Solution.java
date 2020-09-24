package pers.lyz.leetCode.number_10;

public class Solution {
    public static void main(String[] args) {
        String haystack = "aaa";
        String needle = "aa";
        System.out.println(strStr_1(haystack, needle));

    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0)
            return 0;
        return haystack.indexOf(needle);
    }

    public static int strStr_1(String haystack, String needle) {
        int L = needle.length(), n = haystack.length();
        for (int start = 0; start < n - L + 1; ++start) {
            if (haystack.substring(start, start + L).equals(needle))
                return start;
        }
        return -1;
    }
}
