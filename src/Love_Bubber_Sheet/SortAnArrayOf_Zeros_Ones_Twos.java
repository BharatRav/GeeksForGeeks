package Love_Bubber_Sheet;

public class SortAnArrayOf_Zeros_Ones_Twos {
    public static void sort012(int arr[], int n)
    {
        // int l=0; //l for 0's
        // int r=n-1;  // r for 2's
        // int mid=l;  //mid for 1's
        // int temp=0;
        // while(mid<=r){
        //     switch(a[mid]){
        //         case 0: temp=a[mid];
        //                 a[mid]=a[l];
        //                 a[l]=temp;
        //                 l++;
        //                 mid++;
        //                 break;

        //         case 1: mid++;
        //                 break;

        //         case 2: temp= a[mid];
        //                 a[mid]=a[r];
        //                 a[r]=temp;
        //                 r--;
        //                 break;
        //     }
        // }
        int i=0,j=0;
        int k = n-1;

        while(j<=k) {
            if(arr[j]==0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                // arr[i] =arr[i]^arr[j];
                // arr[j] =arr[i]^arr[j];
                // arr[i] =arr[i]^arr[j];
                i++;
                j++;
            } else if(arr[j] ==2) {
                // arr[k] = arr[k]^arr[j];
                // arr[j] = arr[k]^arr[j];
                // arr[k] = arr[k]^arr[j];
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                k--;
            } else if(arr[j]==1) {
                j++;
            }
        }

    }
}
