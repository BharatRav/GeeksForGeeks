package Love_Bubber_Sheet;

import java.util.HashMap;

public class CountPairsWithGivenSum {
    int getPairsCount(int[] arr, int n, int k) {
        int ans =0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i=0;i<n;i++) {
            if (map.containsKey(k-arr[i])) {
                ans+= map.get(k-arr[i]);
            }
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else {
                map.put(arr[i],1);
            }
        }
        return ans;
    }
}
