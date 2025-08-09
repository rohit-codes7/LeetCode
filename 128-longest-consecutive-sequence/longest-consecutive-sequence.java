class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 1;
        int count = 0;

        int n = nums.length;
        if (n == 0)
            return 0;

        Set<Integer> set = new HashSet<>();

        for (var num: nums) {
            set.add(num);

        }

        for (var num:set) {

            // check if it is the first number of the series
            if (!set.contains(num - 1)) {
                count = 1;
                int x = num;
                while (set.contains(x + 1)) {
                    count++;
                    x++;

                }
            }
            longest = Math.max(longest, count);

        }
        return longest;

    }
}