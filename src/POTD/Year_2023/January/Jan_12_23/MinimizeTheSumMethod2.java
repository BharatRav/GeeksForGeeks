package POTD.Year_2023.January.Jan_12_23;

import java.util.*;

public class MinimizeTheSumMethod2 {
    static long minimizeSum(int N, int arr[]) {
        long  ans=0;
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for (int value: arr) {
            pq.offer(value);
        }

        while (pq.size()>1) {
            int sum =pq.poll()+pq.poll();
            ans+=sum;
            pq.offer(sum);
        }
        return ans;
    }
}
