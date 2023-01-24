package POTD.Year_2023.January.Jan_24_23;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ConvertAnArrayToReducedForm {
    void convert(int[] arr, int n) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0;i<n;i++) {
            map.put(arr[i],i);
        }

        int [] b = new int[arr.length];
        for (int i=0;i<n;i++) {
            b[i] = arr[i];
        }
        Arrays.sort(b);

        for (int i=0;i<n;i++) {
            arr[map.get(b[i])] =i;
        }


    }
}
