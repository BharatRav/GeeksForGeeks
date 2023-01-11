package Love_Bubber_Sheet;

import java.util.ArrayList;

public class FirstAndLastOccurrencesOfX {
    //Method 1
    static ArrayList<Long> find(long arr[], int n, int x) {
        long firstOccurrence =firstOccurence(arr,n,x);
        long lastOccurrence =lastOccurence(arr,n,x);
        ArrayList<Long> data = new ArrayList<>();
        data.add(firstOccurrence);
        data.add(lastOccurrence);
        return data;
    }
    static long firstOccurence(long[] arr,int n,int x) {
        int start =0;
        int end =n-1;
        int mid = start+ (end-start)/2;
        long ans1 =-1;
        while (start<=end) {
            if (arr[mid]==x) {
                ans1 =mid;
                end=mid-1;
            } else if (arr[mid]>x) {
                end =mid-1;
            } else {
                start =mid+1;
            }

            mid =start+(end-start)/2;
        }
        return ans1;
    }
    static long lastOccurence(long[] arr,int n,int x) {
        int start =0;
        int end =n-1;
        int mid = start+ (end-start)/2;
        long ans2 =-1;
        while (start<=end) {
            if (arr[mid]==x) {
                ans2 =mid;
                start=mid+1;
            } else if (arr[mid]>x) {
                end =mid-1;
            } else {
                start =mid+1;
            }

            mid =start+(end-start)/2;
        }
        return ans2;
    }

    //Method 2
//    static ArrayList<Long> find(long arr[], int n, int x) {
//        int idx1 =-1;
//        int idx2=-1;
//        for (int i=0;i<n;i++) {
//            if (arr[i]==x){
//                if (idx1==-1)
//                    idx1=i;
//
//                idx2=i;
//            }
//            //T(n) = O(n);
//        }
//
//         ArrayList<Long> data= new ArrayList<>();
//
//            data.add((long)idx1);
//            data.add((long)idx2);
//
//        System.out.println(data);
//        return data;
//    }

    public static void main(String[] args) {
        long[] arr = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        find(arr,7,9);
    }
}
