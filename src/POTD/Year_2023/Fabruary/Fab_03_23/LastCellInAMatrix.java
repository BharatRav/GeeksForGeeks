package POTD.Year_2023.Fabruary.Fab_03_23;

public class LastCellInAMatrix {
    static int [] endPoints(int [][]matrix, int R, int C){
        //code here
        int[][] direction= {
                {0,1},     //right
                {1,0},     //down
                {0,-1},     //left
                {-1,0}      //up
        };

        int i=0,j=0;
        int dir=0;      //initially right->

        int[] result ={0,0};
        while (i>=0 && i<R &&  j>=0 && j<C) {
            if((matrix[i][j] & 1)==1) {
                dir++;
                dir%=4;
                matrix[i][j]=0;
            }
            result[0]=i;
            result[1]=j;
            i+=direction[dir][0];
            j+=direction[dir][1];
        }

        return result;
    }
}
