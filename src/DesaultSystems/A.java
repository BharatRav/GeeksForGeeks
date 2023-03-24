package DesaultSystems;

import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;

public class A {
    public static void main(String[] args) {
        int[] data = {7,6,4,3,3,4,9};
        //7 6 4 3 9

        HashSet<Integer> hs = new HashSet<>();

        for (int i=0;i<data.length;i++) {
            hs.add(data[i]);
        }

        int [] result = new int[hs.size()];
        int idx=0;
        for (int i=0;i<data.length;i++) {
            if(hs.contains(data[i])) {
                result[idx++]=data[i];
                hs.remove(data[i]);
            }
        }

        for (int val:result) {
            System.out.print(val+" ");
        }


   }
}
