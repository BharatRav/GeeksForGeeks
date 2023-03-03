package POTD.Year_2023.March.Mar_03_23;

import java.util.ArrayList;
import java.util.List;

public class CuttingRactangles {
    static List<Long> minimumSquares(long L, long B)
    {
        // code here
        long S = gcd(L,B);      //dimension
        List<Long> result=new ArrayList<>();
        long nos =(L*B)/(S*S);  //no.of square
        result.add(nos);
        result.add(S);
        return result;
    }
    private static Long gcd(long a, long b) {
        if(b==0) {
            return a;
        }
        return gcd(b,a%b);
    }
}
