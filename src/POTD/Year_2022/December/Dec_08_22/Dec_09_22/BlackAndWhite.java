package POTD.Year_2022.December.Dec_08_22.Dec_09_22;


//very very important question




public class BlackAndWhite {
    //Function to find out the number of ways we can place a black and a
    //white Knight on this chessboard such that they cannot attack each other.
    static long numOfWays(int N, int M)
    {
        // add your code here
        int move1[] = {-2, -2, -1, 1, 2, 2, 1, -1};
        int move2[] = {-1, 1, 2, 2, 1, -1, -2, -2};

        long count = 0;
        int allMoves = N*M;

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                // from allMoves we cant place the second knight on (all the valid moves
                // of knight 1 + on the cell where the 1st knight is already placed)
                count += (allMoves - validMoves(move1, move2, N, M, i, j) - 1);
                count = count % 1000000007;
            }
        }

        return count;
    }
    private static int validMoves(int move1[], int move2[], int N, int M, int k1i, int k1j){
        int count = 0;

        for(int i=0; i<8; i++){
            if(isSafe(N, M, move1[i]+k1i, move2[i]+k1j)){
                count++;
            }
        }

        return count;
    }

    private static boolean isSafe(int N, int M, int i, int j){
        return (i>=0 && i<N && j>=0 && j<M);
    }
}