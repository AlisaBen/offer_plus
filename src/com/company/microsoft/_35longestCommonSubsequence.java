package com.company.microsoft;

/**
 * 最长公共子串，二维动态规划
 */
class _35longestCommonSubsequence {
    public static int longestCommonSubsequence(String text1, String text2) {
        if (text1.length() == 0 || text2.length() == 0) return 0;
        int row = text2.length() + 1;
        int column = text1.length() + 1;
        int[][] dp = new int[row][column];
        for (int i = 1; i < row; i += 1) {
            for (int j = 1; j < column; j ++) {
                if (text1.charAt(j - 1) == text2.charAt(i - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[row - 1][column - 1];
        

    }
    public static void main(String[] args) {
        int num = longestCommonSubsequence("BDCABA", "ABCBDAB");
        System.out.println(num);
    }
}