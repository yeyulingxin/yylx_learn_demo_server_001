package com.yylx.test;

public class Test {

    public static void main(String[] args) {
//        int[] nums = new int[]{7,5,3,9,8};
//        sort(nums, 0, nums.length - 1);

//        System.out.println(longestPalindromeSubseq("fcataaf"));

        String a = "abcdefgh";

        System.out.println(a.substring(2, 4));
    }

    private static void sort(int[] args, int start, int end) {
        if (start == end) {
            return;
        }
        if (end < 0) {
            return;
        }
        if (start > end) {
            return;
        }
        int tmp = args[start];
        int i = start;
        int j = end;
        do {
            for (; i < j; j--) {
                if (args[j] < tmp) {
                    args[i] = args[j];
                    args[j] = tmp;
                    break;
                }
            }
            for (; i < j; i++) {
                if (args[i] > tmp) {
                    args[j] = args[i];
                    args[i] = tmp;
                }
            }
        } while (i < j);
        sort(args, start, i - 1);
        sort(args, i + 1, end);
    }

    public static int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int i = n - 1; i >= 0; i--) {
            dp[i][i] = 1;
            char c1 = s.charAt(i);
            for (int j = i + 1; j < n; j++) {
                char c2 = s.charAt(j);
                if (c1 == c2 && (j - i == 1 || s.charAt(i + 1) == s.charAt(j - 1))) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][n - 1];
    }

}