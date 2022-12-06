package Beginners_DSA_Sheet;

public class MissingNumberInArray {
    int MissingNumber(int array[], int n) {
        int sum =0;
        for(int val: array) {
            sum+=val;
        }
        int sumAll = (n*(n+1)/2);
        return sumAll-sum;
    }
}
