package POTD.Year_2023.January.Jan_10_23;

public class TransformToTheSumTree {
    class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = null;
            right = null;
        }
    }

        public void toSumTree(Node root){
            if(root == null ) return;

            toSumHelperTree(root);
        }

        public static int toSumHelperTree(Node root) {
            if (root == null) {
                return 0;
            }
            int data = root.data;
            if (root.left ==null && root.right == null) {
                // int data = root.data;
                root.data =0;
                return data;
            }

            int leftSum = toSumHelperTree(root.left);
            int rightSum = toSumHelperTree(root.right);

            root.data = leftSum+rightSum;

            return data+root.data;
        }
}
