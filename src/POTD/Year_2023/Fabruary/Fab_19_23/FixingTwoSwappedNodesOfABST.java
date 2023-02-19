package POTD.Year_2023.Fabruary.Fab_19_23;

public class FixingTwoSwappedNodesOfABST {
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
    Node first = null, second = null;
    Node prev = null;

    public Node correctBST(Node root) {

        inorder(root);

        // System.out.println(first.data+" "+second.data);

        int temp = first.data;
        first.data = second.data;
        second.data = temp;

        return root;

    }



    public void inorder(Node root) {

        if(root == null) return;

        inorder(root.left);

        if(prev!=null){
            if(prev.data > root.data){
                if(first == null) first = prev;

                second = root;
            }
        }
        prev = root;
        inorder(root.right);
    }
}
