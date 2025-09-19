class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backtrack(ans, temp, nums,0);
        return ans;
    }

    public void backtrack(List<List<Integer>> resultSet, List<Integer>temp, int[] arr, int start){
        resultSet.add(new ArrayList<>(temp));

        for(int i = start;i<arr.length;i++){
            if (i > start && arr[i] == arr[i - 1]) continue;

            temp.add(arr[i]);
            backtrack(resultSet, temp, arr, i+1);
            temp.remove(temp.size()-1);
        }
    }
}