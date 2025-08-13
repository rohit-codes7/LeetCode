class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums); // Ascending order
        
        int distinctCount = 1; // Count of distinct elements found
        int n = nums.length;
        
        for (int i = n - 2; i >= 0; i--) { // Traverse backwards
            if (nums[i] != nums[i + 1]) { // Found a distinct number
                distinctCount++;
                if (distinctCount == 3) { // Third distinct max found
                    return nums[i];
                }
            }
        }
        return nums[n - 1]; // If less than 3 distinct numbers, return max
    }
}
