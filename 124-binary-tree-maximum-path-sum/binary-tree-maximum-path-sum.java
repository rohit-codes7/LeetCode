
class Solution {
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        
        helper(root);
        return maxSum;
    }

    private int helper(TreeNode root){
        if(root==null) return 0;

        int leftGain = Math.max(helper(root.left),0);
        int rightGain =Math.max(helper(root.right),0);


        int currSum = root.val + leftGain + rightGain;
        
        maxSum = Math.max(maxSum, currSum);

        return root.val + Math.max(leftGain, rightGain);
    }

}