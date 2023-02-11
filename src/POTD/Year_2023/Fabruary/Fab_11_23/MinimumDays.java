package POTD.Year_2023.Fabruary.Fab_11_23;

public class MinimumDays {
    public static int getMinimumDays(int N, String S, int[] P) {
        // code here
        int days=0;

        StringBuilder sb=new StringBuilder(S);

        for(int i=0;i<sb.length()-1;i++){

            if(sb.charAt(i)==sb.charAt(i+1)&&sb.charAt(i)!='?'){

                days++;

                sb.setCharAt(P[days-1],'?');

                i--;

            }

        }

        return days;
    }
}
