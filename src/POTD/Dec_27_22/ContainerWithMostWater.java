package POTD.Dec_27_22;

public class ContainerWithMostWater {
    long maxArea(int A[], int len){
        // Code Here

        long maxArea = 0;
        int low = 0;
        int high = len-1;

        while (low<high) {
            int area = Math.abs(high-low) * Math.min(A[low],A[high]);
            if(A[low]<A[high]) low++;
            else high--;

            maxArea = Math.max(maxArea,area);
        }
        return maxArea;
    }
}
