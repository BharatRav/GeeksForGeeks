package POTD.Year_2023.January.Jan_11_23;

import java.util.Arrays;

public class MakeArrayElementsUnique {
    public long minIncrements(int[] arr, int N) {
        // Code here
        Arrays.sort(arr);
        int count =0;
        for (int i=1;i<N;i++) {
            if(arr[i] <=arr[i-1]) {
                count+=(arr[i-1]-arr[i])+1;
                arr[i] =arr[i-1]+1;
            }
        }
        return count;
    }
    //T(n) = O(nLog(n))
}
