package POTD.Year_2023.Fabruary.Fab_01_23;

public class DistinctColoring {
    public static long distinctColoring(int N, int[]r, int[]g, int[]b){
        //code here
        long[][] dp=new long[N][3];

        dp[0][0]=r[0];
        dp[0][1]=g[0];
        dp[0][2]=b[0];

        for(int i=1;i<N;i++){
            dp[i][0]=Math.min(dp[i-1][1],dp[i-1][2])+r[i];
            dp[i][1]=Math.min(dp[i-1][0],dp[i-1][2])+g[i];
            dp[i][2]=Math.min(dp[i-1][0],dp[i-1][1])+b[i];
        }
        return Math.min(dp[N-1][0],Math.min(dp[N-1][1],dp[N-1][2]));

    }
}
