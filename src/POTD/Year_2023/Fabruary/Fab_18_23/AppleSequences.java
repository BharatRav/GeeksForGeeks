package POTD.Year_2023.Fabruary.Fab_18_23;

public class AppleSequences {
    public static int appleSequence(int n, int m, String arr){
        //code here
        int left=0,right=0,oranges=0,maxLen=0;

        while (right<n) {
            if (arr.charAt(right)=='O') oranges++;

            while (oranges>m) {
                if (arr.charAt(left)=='O') oranges--;

                left++;
            }
            maxLen= Math.max(maxLen,right-left+1);
            right++;
        }
        return maxLen;
    }
}
