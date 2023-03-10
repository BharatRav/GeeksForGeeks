package POTD.Year_2023.March.Mar_10_23;

import java.util.Arrays;

//Link:-https://practice.geeksforgeeks.org/problems/d54c71dc974b7db3a200eb63f34e3d1cba955d86/1
public class MaximumTripletProduct {
    Long maxTripletProduct(Long arr[], int n)
    {
        // Complete the function
        Arrays.sort(arr);

        return Math.max(arr[0]*arr[1]*arr[n-1], arr[n-1]*arr[n-2]*arr[n-3]);
    }
}
