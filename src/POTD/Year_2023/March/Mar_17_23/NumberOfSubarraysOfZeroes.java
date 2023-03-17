package POTD.Year_2023.March.Mar_17_23;

public class NumberOfSubarraysOfZeroes {
    long no_of_subarrays(int N, int [] arr) {
        //Write your code here
        int count=0;
        long ans=0;
        for (int i=0;i<N;i++) {
            if(arr[i]==0) {
                count++;
                ans+=count;
            }else {
                count=0;
            }
        }
        return ans;
    }
}
