package POTD.Year_2023.April.Apr_12_23;

import java.util.Arrays;

public class DominantPair {
    public static int dominantPairs(int n, int[] arr) {
        // code here
        Arrays.sort(arr,0,n/2);
        Arrays.sort(arr,n/2,n);
        int i = 0, j=n/2 , result = 0;
        while(i<n/2 && j < n){
            if(arr[i]>=5*arr[j]){
                result += (n/2 -i);
                j++;
            }else i++;
        }
        return result;
    }

}
