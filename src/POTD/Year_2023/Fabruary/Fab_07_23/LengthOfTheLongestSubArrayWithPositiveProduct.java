package POTD.Year_2023.Fabruary.Fab_07_23;

public class LengthOfTheLongestSubArrayWithPositiveProduct {
    int maxLength(int arr[], int n) {
        int len=0;
        int neg_found=-1,zero_found=-1,neg=0;
        for( int i=0;i<n;i++) {
            if(arr[i]<0) {
                neg++;
                if(neg_found==-1) {
                    neg_found=i;
                }
            }
            if(arr[i]==0) {
                zero_found=i;
                neg_found=-1;   //product will be now 0
                neg=0;  //reset
            }

            if(neg%2==0) {      //we will got positive product

                len=Math.max(len,i-zero_found);
            } else {

                len= Math.max(len,i-neg_found);
            }
        }
        return len;
    }
}
