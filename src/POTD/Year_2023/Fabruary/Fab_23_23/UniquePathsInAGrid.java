package POTD.Year_2023.Fabruary.Fab_23_23;

public class UniquePathsInAGrid {
    static int uniquePaths(int n, int m, int[][] grid){
        int mod = (int)10e8+7;
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0)  dp[i][j] = 0;
                else if (i == 0 && j == 0) dp[i][j] = 1;
                else if (i == 0)  dp[i][j] = dp[i][j-1];
                else if (j == 0) dp[i][j] = dp[i-1][j];
                else dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % mod;
            }
        }
        return dp[n-1][m-1];
    }
}
