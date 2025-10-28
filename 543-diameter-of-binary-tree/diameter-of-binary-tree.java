
class Solution {
    int diameter  =0;
    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return diameter;
        
    }

    private int helper(TreeNode root){
        if(root==null) return 0;

        int leftHeight = helper(root.left);
        int rightHeight = helper(root.right);

        int currDiameter = leftHeight + rightHeight;

        diameter = Math.max(diameter, currDiameter);


        return Math.max(leftHeight, rightHeight) +1;

 
    }
}