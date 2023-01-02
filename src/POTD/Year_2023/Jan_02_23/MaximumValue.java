package POTD.Year_2023.Jan_02_23;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumValue {
    class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    ArrayList<Integer> maximumValue(Node node) {
        //code here
        ArrayList<Integer> result = new ArrayList<>();
        if (node ==null) {
            result.add(0);
            return result;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);


        while (!queue.isEmpty()) {
            Node temp;
            int size = queue.size();
            int max=Integer.MIN_VALUE;
            for (int i=0;i<size;i++) {
                temp = queue.poll();
                max =Math.max(max,temp.data);
                if (temp.left!=null) {
                    queue.add(temp.left);
                }
                if (temp.right!=null) {
                    queue.add(temp.right);
                }
            }
            result.add(max);

        }
        return result;
    }
}
