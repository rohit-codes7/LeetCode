class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root ==null) return false;
        // Create 2 stacks for the path and the sum

        Stack<TreeNode> path = new Stack<>();
        Stack<Integer> sumPath = new Stack<>();

        path.push(root);
        sumPath.push(root.val);

        while(!path.isEmpty()){
            TreeNode temp = path.pop();
            int tempVal = sumPath.pop();

            if(temp.right == null && temp.left == null && tempVal == targetSum) 
            return true;

            if(temp.right != null){
                path.push(temp.right);
                sumPath.push(tempVal + temp.right.val);
            }

            if(temp.left != null){
                path.push(temp.left);
                sumPath.push(tempVal + temp.left.val);
            }
        }

        return false;

    }
}