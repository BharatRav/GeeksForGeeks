package POTD.Year_2023.March.Mar_20_23;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShortestXYDistanceInGrid {
    static class Pair{
        int row;
        int col;

        public Pair(int _row, int _col){
            this.row=_row;
            this.col=_col;
        }
    }

    static int shortestXYDist(ArrayList<ArrayList<Character>> grid, int N,
                              int M) {
        //code here
        int min = Integer.MAX_VALUE;
        ArrayList<Pair> list_y = new ArrayList<>();

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(grid.get(i).get(j)=='Y'){
                    list_y.add(new Pair(i,j));
                }
            }
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(grid.get(i).get(j)=='X'){
                    int row_x = i;
                    int col_x = j;

                    for(Pair pair : list_y){
                        int row_y = pair.row;
                        int col_y = pair.col;

                        int mhd = Math.abs(row_x - row_y) + Math.abs(col_x - col_y);
                        min = Math.min(min,mhd);

                    }
                }
            }
        }
        return min;


    }
    public static void main(String[] args) {
        int N = 4, M = 4;
        ArrayList<ArrayList<Character>> grid = new ArrayList<>();

         char[][] data = {{'X', 'O', 'O', 'O'},
        {'O', 'Y', 'O', 'Y'},
        {'X', 'X', 'O', 'O'},
        {'O', 'Y', 'O', 'O'}};

        for (int i=0;i<N;i++) {
            ArrayList<Character> curr = new ArrayList<>();
            for (int j=0;j<M;j++) {
                curr.add(data[i][j]);
            }
            grid.add(curr);
        }

        System.out.println(grid);
        System.out.println(shortestXYDist(grid,N,M));
    }
}
