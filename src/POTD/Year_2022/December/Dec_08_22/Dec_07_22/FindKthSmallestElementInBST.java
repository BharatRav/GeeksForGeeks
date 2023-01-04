package POTD.Year_2022.December.Dec_08_22.Dec_07_22;

public class FindKthSmallestElementInBST {
      static class Node {
     int data;
     Node left, right;
     public Node(int d) {
         data = d;
         left = right = null;
     }
 }
    // Return the Kth smallest element in the given BST
    int count;
    int ans;
    private void inorderTraversal(Node rootNode,int K) {
        if (rootNode != null) {
            inorderTraversal(rootNode.left,K);
            count++;
            if (count==K) {
                ans = rootNode.data;
            }
            inorderTraversal(rootNode.right,K);
        }

    }
    public int KthSmallestElement(Node root, int K) {
        count =0;
        ans =-1;
        inorderTraversal(root,K);
        return ans;
    }
}

/*
Given a BST and an integer K. Find the Kth Smallest element in the BST using O(1) extra space.

Example 1:

Input:
      2
    /   \
   1     3
K = 2
Output: 2
Explanation: 2 is the 2nd smallest element in the BST

Example 2:

Input:
        2
      /  \
     1    3
K = 5
Output: -1
Explanation: There is no 5th smallest element in the BST as the size of BST is 3


Your Task:
You don't need to read input or print anything. Your task is to complete the function KthSmallestElement() which takes the root of the BST and integer K as inputs and return the Kth smallest element in the BST, if no such element exists return -1.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1<=Number of nodes<=100000
 */