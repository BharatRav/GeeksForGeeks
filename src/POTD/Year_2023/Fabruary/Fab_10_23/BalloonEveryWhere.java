package POTD.Year_2023.Fabruary.Fab_10_23;

public class BalloonEveryWhere {

    // T(n)= O(n)//s.length;
    //S(n)  =O(1)  // constant ballon
    public int maxInstance(String s) {
        int n=s.length();
        if (n<7) {
            return 0;       //balloon length =7
        }

        int[] ASCII =new int[26];

        for (int i=0;i<n;i++) {
            ASCII[s.charAt(i)-'a']++;
        }

        String ballon ="ballon";
        int res=0;
        while ( ASCII[ballon.charAt(0)-'a']>=1 &&
                ASCII[ballon.charAt(1)-'a']>=1 &&
                ASCII[ballon.charAt(2)-'a']>=2 &&
                ASCII[ballon.charAt(4)-'a']>=2 &&
                ASCII[ballon.charAt(5)-'a']>=1
        ) {
            res++;
            ASCII[ballon.charAt(0)-'a']-=1;
            ASCII[ballon.charAt(1)-'a']-=1;
            ASCII[ballon.charAt(2)-'a']-=2;
            ASCII[ballon.charAt(4)-'a']-=2;
            ASCII[ballon.charAt(5)-'a']-=1;

        }
        return res;

    }
}
