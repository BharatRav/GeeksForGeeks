package POTD.Dec_30_22;

public class SingleValuedSubtree {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }
    public int singlevalued(Node currentNode)
    {
        //code here
        if(currentNode == null) return 0;

        if(isSingleValued(currentNode)) {
            return 1+singlevalued(currentNode.left)+singlevalued(currentNode.right);
        }
        return singlevalued(currentNode.left)+singlevalued(currentNode.right);
    }

    private boolean isSingleValued(Node currentNode) {

        if(currentNode == null) return true;

        if (currentNode.left!=null && currentNode.left.data!=currentNode.data) return false;

        if (currentNode.right!=null && currentNode.right.data!=currentNode.data) return false;

        return isSingleValued(currentNode.left) && isSingleValued(currentNode.right);
    }
}
