package Beginners_DSA_Sheet;

import java.util.ArrayList;

public class ReverseArrayInGroups {
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {

        for (int i =0;i<n;i=i+k) {
            int start =i;
            int end = i+k-1;
            if (end>=n) {
                end =n-1;
            }


            while (start<end) {
                int val1 = arr.get(start);
                int val2 = arr.get(end);

                val1 = val1 ^ val2;
                val2 = val1 ^ val2;
                val1 = val1 ^ val2;

                arr.set(start,val1);
                arr.set(end,val2);
                start++;
                end--;
            }
        }
    }
}
