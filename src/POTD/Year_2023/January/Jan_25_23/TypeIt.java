package POTD.Year_2023.January.Jan_25_23;

public class TypeIt {
    int minOperation(String s) {
        // code here
        int res = s.length();

        int n= s.length();

        String temp="";
        int max=0;
        for (int i=0;i<n;i++) {
            temp+=s.charAt(i);

            if(s.substring(i+1).contains(temp)) {
                max =Math.max(max,i);
            }
        }
        return res-max;
    }
}
