package POTD.Year_2023.Fabruary.Fab_13_23;

public class ArithmeticNumber {
    static int inSequence(int A, int B, int C){
        if(C==0) {
            return A == B?1:0;
        }
        // b =a+(n-1)c
        //b-a =(n-1)c
        return ((B-A)%C)==0 && (B-A)/C>=0?1:0 ;
    }
}
