/* 
Given a binary tree, find its height.


Example 1:

Input:
     1
    /  \
   2    3
Output: 2
*/

class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        if(node==null){
            return 0;
        }
        int left=height(node.left);
        int right=height(node.right);
        return 1+Math.max(left,right);
    }
}
