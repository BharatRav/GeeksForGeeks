package POTD.Year_2023.January.Jan_28_23;

import java.util.HashMap;

public class ScrambledString {
    static HashMap<String,Boolean> map = new HashMap<>();
    static boolean isScramble(String S1,String S2)
    {
        if (S1.length()!=S2.length()) return false;

        if(S1.equals(S2)) return true;

        int n= S1.length();
        boolean flag =false;

        String key =S1+"_"+S2;
        if (map.containsKey(key)) {
            return map.get(key);
        }

        for (int i=1;i<n;i++) {
            boolean swap =(isScramble(S1.substring(0,i),S2.substring(n-i,n)) &&
                    isScramble(S1.substring(i,n),S2.substring(0,n-i)));

            boolean noswap =(isScramble(S1.substring(0,i),S2.substring(0,i)) &&
                    isScramble(S1.substring(i,n),S2.substring(i,n)));

            if(swap || noswap) {
                flag =true;
                break;
            }

        }
        map.put(key,flag);
        return flag;

    }
}
