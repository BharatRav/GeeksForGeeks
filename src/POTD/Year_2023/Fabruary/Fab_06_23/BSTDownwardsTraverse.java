package POTD.Year_2023.Fabruary.Fab_06_23;

public class BSTDownwardsTraverse {
    class Node{
        int data;
        Node left,right;
        Node(int data) {
            this.data=data;
        }
    }
    long verticallyDownBST(Node root,int target){
        int x=0;
        while(root!=null) {
            if(root.data==target) {
                break;
            }

            if(root.data<target) {
                root=root.right;
                x++;
            } else {
                root=root.left;
                x--;
            }
        }

        if(root==null) {
            return -1;
        }

        return helper(root,x,x)-root.data;
    }
    private static long helper(Node root, int x,int curr) {
        if(root==null) {
            return 0;
        }

        long res=0;

        if (x==curr) {
            res=root.data;
        }
        res+=helper(root.left,x,curr-1);
        res+=helper(root.right,x,curr+1);

        return res;

    }
}
