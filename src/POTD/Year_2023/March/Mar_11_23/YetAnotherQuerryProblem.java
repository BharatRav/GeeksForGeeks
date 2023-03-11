package POTD.Year_2023.March.Mar_11_23;

import java.util.ArrayList;

public class YetAnotherQuerryProblem {
    public static ArrayList<Integer> solveQueries(int N, int num, int[] A, int[][] Q) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int count;
        int[] frequency = new int[N];
        for(int i=0; i<N; i++) {
            count = 0;
            for(int j=i; j<N; j++) {
                if(A[j] == A[i])
                    count++;
            }
            frequency[i] = count;
        }

        for(int i=0; i<Q.length; i++) {
            int l = Q[i][0];
            int r = Q[i][1];
            int k = Q[i][2];
            count = 0;
            for(int j=l; j<=r; j++) {
                if(frequency[j] == k)
                    count++;
            }
            list.add(count);
        }
        return list;
    }
}
