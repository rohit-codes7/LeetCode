class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int leftProduct = 1;
        int rightProduct = 1;
        int ans = nums[0];

        for (int i = 0; i < nums.length; i++) {

            if (leftProduct == 0) {
                leftProduct = 1;
            }

            if (rightProduct == 0) {
                rightProduct = 1;
            }
            leftProduct *= nums[i];
            rightProduct *= nums[n - i - 1];

            ans = Math.max(ans, Math.max(leftProduct, rightProduct));
        }
        return ans;

    }
}