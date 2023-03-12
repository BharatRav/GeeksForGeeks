package POTD.Year_2023.March.Mar_12_23;

public class BinaryMatrixHavingMaximumNumberO1 {
    public int[] findMaxRow(int mat[][], int N) {
        // code here
        int rowNumber=0,maxCount=0;
        for (int i=0;i<N;i++) {
            int OneCount=0;

            for (int j=N-1;j>=0;j--) {
                if (mat[i][j]==0) {
                    break;
                }
                OneCount++;
            }
            if (OneCount>maxCount) {
                rowNumber=i;
                maxCount = OneCount;
            }
        }

        int[] result= new int[]{rowNumber,maxCount};
        return result;
    }
}
