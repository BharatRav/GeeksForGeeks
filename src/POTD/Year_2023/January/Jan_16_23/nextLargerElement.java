package POTD.Year_2023.January.Jan_16_23;

import java.util.Stack;

public class nextLargerElement {
    // Your code here
    public static long[] nextLargerElement(long[] arr, int n) {
        // Your code here
        Stack<Long> st=new Stack<>();
        long ans[]=new long[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]= -1;
            }else{
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }
}
