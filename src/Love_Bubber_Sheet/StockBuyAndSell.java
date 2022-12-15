package Love_Bubber_Sheet;

import java.util.ArrayList;
import java.util.Arrays;

public class StockBuyAndSell {
    //Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer> > stockBuySell(int arr[], int n) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int buy=0;
        int sell=n-1;
        int i=1;
        while(i<n) {
            while(i<n&&arr[buy]>=arr[i]) {
                buy=i;
                i++;
            }
            if(buy==n-1) {
                break;
            }
            while(i<n&&arr[i]>=arr[i-1]) {
                sell=i;
                i++;
            }
            list.add(new ArrayList<Integer>(Arrays.asList(buy, sell)));
            buy=i;
        }
        return list;
    }
}
