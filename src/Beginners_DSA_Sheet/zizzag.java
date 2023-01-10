package Beginners_DSA_Sheet;

import java.util.*;

public class zizzag {
    class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    ArrayList<Integer> zigZagTraversal(Node root)
    {

        //two stack Approach
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;

//
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        st1.push(root);

        while (!st1.isEmpty() ||!st2.isEmpty()) {
            while (!st1.isEmpty()) {
                Node temp = st1.pop();
                result.add(temp.data);
                if (temp.left!=null) {
                    st2.push(temp.left);
                }
                if(temp.right!=null) {
                    st2.push(temp.right);
                }
            }

            while ((!st2.isEmpty())) {
                Node temp = st2.pop();
                result.add(temp.data);
                if(temp.right!=null) {
                    st1.push(temp.right);
                }
                if(temp.left!=null) {
                    st1.push(temp.left);
                }
            }
        }

        return result;
    }
}
