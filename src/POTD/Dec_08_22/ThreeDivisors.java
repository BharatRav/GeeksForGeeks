package POTD.Dec_08_22;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeDivisors {
    static ArrayList<Integer> threeDivisors(ArrayList<Long> query, int q){
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        long max = query.get(0);


        for (int i =1; i<query.size();i++) {
            if(query.get(i)>max) {
                max = query.get(i);
            }
        }
        int nmax =(int)Math.sqrt(max);

        boolean[] arr =new boolean[nmax+2];
        Arrays.fill(arr,true);
        arr[0] = arr[1] = false;

        for (int p =2;p*p<=arr.length;p++) {
            //if prime[p] is not changed,
            //then it is a prime
            if(arr[p]==true) {
                //update all multiples of p
                for(int i=p*2;i<arr.length;i+=p) {
                    arr[i] =false;
                }
            }
        }

        for(int i=0;i<q;i++) {
            long N = query.get(i);
            int count =0;
            for(long j=2;j*j<=N;j++) {
                if(arr[(int)(j)]) {
                    count++;
                }
            }
            result.add(count);
        }

        return result;

    }
}
