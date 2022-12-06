package School;

public class PrintAlternateElementsOfAnArray {
    public static void print(int arr[], int n) {
        for(int i=0;i<n;i+=2){
            System.out.print(arr[i]+" ");
        }
    }
}
