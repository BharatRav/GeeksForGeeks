package POTD.Year_2023.April.Apr_08_23;

import java.util.ArrayList;

public class MakeTheArrayBeautiful {
    public static ArrayList<Integer> makeBeautiful(int[] arr) {
        // code here

        ArrayList<Integer> result=new ArrayList<>();
        int data;
        for (int i=0;i<arr.length;i++) {
            if (!result.isEmpty()) {
                data = result.get(result.size()-1);

                if(data<0 && arr[i]<0 || data>=0 && arr[i]>=0) {
                    result.add(arr[i]);
                } else {
                    result.remove(result.size()-1);
                }

            } else {
                result.add(arr[i]);
            }
        }
        return result;
    }
}
