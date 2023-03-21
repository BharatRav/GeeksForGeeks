package POTD.Year_2023.March.Mar_21_23;

public class TaxiBooking {
    public static int minimumTime(int N, int cur, int[] pos, int[] time) {
        // code here
        int min=Integer.MAX_VALUE,tim=0;
        for (int i=0;i<N;i++) {
            tim =Math.abs(cur-pos[i])*time[i];
            min= Math.min(min,tim);
        }
        return min;

    }
}
