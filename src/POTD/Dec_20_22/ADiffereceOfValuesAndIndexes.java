package POTD.Dec_20_22;

public class ADiffereceOfValuesAndIndexes {
    // Function for finding maximum and value pair
    public static int maxDistance (int arr[], int n) {
        //Complete the function
        int ma = arr[0], mi = arr[0], res = 0;
        for(int i=0; i<n; i++) {
            res = Math.max(res, Math.max(ma-arr[i], arr[i]-mi)+i);
            mi = Math.min(mi, arr[i]+i);
            ma = Math.max(ma, arr[i]-i);
        }
        return res;
    }

}
