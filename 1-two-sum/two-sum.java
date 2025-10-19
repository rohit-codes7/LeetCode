class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // key, value
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) { // cause for  key it's o(1) and for value its o(n)
                return new int[] { map.get(complement), i };// return the index;
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[] {};

    }
}