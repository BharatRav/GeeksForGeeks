package POTD.Year_2023.Fabruary.Fab_22_23;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectNodesAtSameLevel {
    class Node {
        int data;
        Node left;
        Node right;
        Node nextRight;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
            nextRight = null;
        }
    }


    public void connect(Node root) {
        if (root==null) return;

        root.nextRight=null;

        Queue<Node> queue= new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            int size =queue.size();
            Node prev =null;
            for (int i=0;i<size;i++) {
                Node temp = queue.poll();
                if (temp.left!=null) {
                    queue.add(temp.left);
                }
                if (temp.right!=null) {
                    queue.add(temp.right);
                }


                if (prev!=null) {
                    prev.nextRight=temp;
                }
                prev =temp;
            }

        }

    }
}
