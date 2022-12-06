package School;

public class SecondLargest {
    int print2largest(int arr[], int n) {
        // code here
        int largest = arr[0];
        int secLargest = -1;

        int curr ;
        for (int i=1;i<n;i++) {
            curr = arr[i];
            if(curr>largest) {
                secLargest = largest;
                largest = arr[i];
            }

            if (curr>secLargest && curr < largest) {
                secLargest = curr;
            }
        }

        return secLargest;
    }
}
