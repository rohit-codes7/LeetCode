class Solution {
    public List<Integer> findDuplicates(int[] nums) {
          ArrayList<Integer> result = new ArrayList<>();
        Map<Integer,Integer> freq = new HashMap<>();
        for(var num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for(var num:freq.keySet()){
        
        if(freq.get(num)>=2){
            
            result.add(num);
        }
        }
        return result;
        
    }
}