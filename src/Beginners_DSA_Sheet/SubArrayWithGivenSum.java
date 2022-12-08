package Beginners_DSA_Sheet;

import java.util.ArrayList;

public class SubArrayWithGivenSum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        int currSum =0;
        int idx = 0;

        for (int i=0;i<n;i++) {
            currSum+= arr[i];

            while (currSum >s && idx <i) {
                currSum-=arr[idx++];
            }
            if(currSum == s) {
                ans.add(idx+1);
                ans.add(i+1);
                return ans;
            }
        }

        if (ans.size() == 0) {
            ans.add(-1);
        }
        return ans;
    }
}

