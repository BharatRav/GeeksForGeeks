package POTD.Year_2023.Fabruary.Fab_04_23;

public class MaxSumWithoutAdjacents {
    int findMaxSum(int arr[], int n) {
        // code here
        if(n==1) return arr[0];

        int[] dp = new int[n+1];

        dp[1]= arr[0];
        for (int i=2;i<=n;i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2]+arr[i-1]);
        }

        return Math.max(dp[n],dp[n-1]);
    }
}
