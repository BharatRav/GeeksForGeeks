package POTD.Year_2023.Fabruary.Fab_08_23;

public class countNumberOfFreeCell {
    long[] countZero(int N, int K, int[][] arr){
        // code here
        int[] row= new int[N+1];
        int[] col= new int[N+1];
        long[] ans= new long[K];

        int oneRow=0,oneCol=0;
        for (int i=0;i<K;i++) {
            int r =arr[i][0];
            if (row[r]==0) {
                row[r]++;
                oneRow++;
            }

            int c= arr[i][1];

            if (col[c]==0) {
                col[c]++;
                oneCol++;
            }

            ans[i]= N*N-(N*(oneRow+oneCol)-oneCol*oneRow);
        }
        return ans;
    }
}
