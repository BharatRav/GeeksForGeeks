package POTD.Year_2023.April.Apr_15_23;

import java.util.HashSet;

public class FindTotalTimeTaken {
    public static long totalTime(int n,int arr[],int time[])
    {
        long total=0;

        HashSet<Integer> hs = new HashSet<>();
        hs.add(arr[0]);

        for (int i=1;i<n;i++) {
            if(!hs.contains(arr[i])) {
                total+=1;
                hs.add(arr[i]);
            } else {
                total+= time[arr[i]-1];
            }
        }
        return total;
    }
}
