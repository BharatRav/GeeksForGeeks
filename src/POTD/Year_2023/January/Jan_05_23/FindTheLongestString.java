package POTD.Year_2023.January.Jan_05_23;

import java.util.HashSet;
import java.util.Set;

public class FindTheLongestString {
    public static String longestString(int n, String[] arr) {
        // code here
        int count =-1;
        String result ="";


        Set<String> hs = new HashSet<>();
        for (int i=0;i<n;i++) {
            hs.add(arr[i]);
        }
        // System.out.println(hs);

        for (int i=0;i<n;i++) {
            String str= arr[i];
            int size =str.length();
            int j=0;
            for (j=0;j<size-1;j++) {
                if (!hs.contains(str.substring(0,j+1))) {
                    break;
                }
            }
            if (j ==(size-1)) {
                result = check(str, result);
            }
        }
        return result;
    }
    private static String check(String s1, String s2) {
        if (s1.length() > s2.length())  return s1;
        else if (s2.length() > s1.length()) return s2;
        if (s1.compareTo(s2) < 0)   return s1;
        else return s2;

    }
}
