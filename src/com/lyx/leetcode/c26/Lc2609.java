package com.lyx.leetcode.c26;

/**
 * 2609.最长平衡子字符串
 *
 * @version 2023/11/08
 */
public class Lc2609 {
    public int findTheLongestBalancedSubstring(String s) {
        int ans = 0;
        int n = s.length(), idx = 0;
        while (idx < n) {
            int a = 0, b = 0;
            while (idx < n && s.charAt(idx) == '0' && ++a >= 0) {
                idx++;
            }
            while (idx < n && s.charAt(idx) == '1' && ++b >= 0) {
                idx++;
            }
            ans = Math.max(ans, Math.min(a, b) * 2);
        }
        return ans;
    }
}
