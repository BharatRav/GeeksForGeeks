package POTD.Year_2023.Fabruary.Fab_16_23;

public class GoodStones {
    public static int goodStones(int n, int[] arr) {
        int[] dp = new int[n];
        int count = 0;

        for(int i=0; i<n; i++) {
            if(dp[i] == 0) {
                solve(i, n, arr, dp);
            }

            if(dp[i] == 2){
                count++;
            }
        }
        return count;
    }

    private static boolean solve(int i, int n, int[] arr, int[] dp) {
        if(i < 0 || i >= n || dp[i] == 2) return true;
        if(dp[i] == 1) return false;

        dp[i] = 1;
        boolean flag = solve(i+arr[i], n, arr, dp);

        if(flag) {
            dp[i] = 2;
        }
        return flag;
    }
}
