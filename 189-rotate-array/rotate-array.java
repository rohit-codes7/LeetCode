class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n; // if k is greater then n


        //Reverse the whole array
        reverse(nums, 0, n - 1);

        //Reverse the kth elements
        reverse(nums, 0, k - 1);

        // Reverse the elment after the kth element
        reverse(nums, k, n - 1);

    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}