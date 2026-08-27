//Memoisation Approach 

class Solution {
    static int[][] dp;

    public int longestCommonSubsequence(String text1, String text2) {

        int n = text1.length();
        int m = text2.length();

        dp = new int[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j] = -1;
            }
        }

        return lcs(text1, text2);
    }

    private int lcs(String text1, String text2) {

        int n = text1.length();
        int m = text2.length();

        if (n == 0 || m == 0) {
            return 0;
        }

        // Already calculated
        if (dp[n][m] != -1) {
            return dp[n][m];
        }

        String t1 = text1.substring(0, n - 1);
        String t2 = text2.substring(0, m - 1);

        if (text1.charAt(n - 1) == text2.charAt(m - 1)) {

            dp[n][m] = lcs(t1, t2) + 1;

        } else {

            int ans1 = lcs(t1, text2);
            int ans2 = lcs(text1, t2);

            dp[n][m] = Math.max(ans1, ans2);
        }

        return dp[n][m];
    }
}