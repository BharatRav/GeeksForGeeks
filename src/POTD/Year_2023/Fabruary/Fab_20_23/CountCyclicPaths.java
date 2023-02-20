package POTD.Year_2023.Fabruary.Fab_20_23;

public class CountCyclicPaths {
    public static int countPaths(int N){
        //code here
        int m=1000000000+7;
        long res =0;

        for (int i=2;i<=N;i++) {
            if(i%2==0) {
                res =(res%m*3%m)%m+3;
            } else {
                res = (res%m*3%m)%m-3;
            }
        }
        return (int)res%m;
    }
}
