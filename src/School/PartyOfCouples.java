package School;
// GFG Link:- https://practice.geeksforgeeks.org/problems/alone-in-couple5507/1?page=1&difficulty[]=-2&status[]=unsolved&curated[]=1&sortBy=submissions

public class PartyOfCouples {
    static int findSingle(int N, int arr[]){
        // code here
        int sum =0;

        for (int i=0;i<N;i++) {
            sum= sum^arr[i];
        }
        return sum;
    }
}
