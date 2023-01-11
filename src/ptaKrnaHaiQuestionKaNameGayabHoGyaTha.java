import java.util.Arrays;

public class ptaKrnaHaiQuestionKaNameGayabHoGyaTha {
    long maxSum(long arr[] ,int n)
    {
        if(n==1) return arr[n-1];

        long sum =0;
        Arrays.sort(arr);
        int start =0;
        int last =n-1;
        while(start<last) {
            // sum+=Math.abs(arr[end]-arr[start]);
            // allways arr[end is greater because i'hv sorted it so no need of Math.abs

            sum+=(arr[last]-arr[start]);
            if(start+1!=last) {
                sum+=(arr[last]-arr[start+1]);
            }
            start++;
            last--;
        }

        sum+=arr[start]-arr[0];
        return sum;
        // 4 2 1 8
        // 1 2 4 8
        // 1 8 2 4
        // 7+6+2+3
    }
}
