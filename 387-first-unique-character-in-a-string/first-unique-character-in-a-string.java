class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> freq = new HashMap<>();
        for(char x:s.toCharArray()){
            freq.put(x,freq.getOrDefault(x,0)+1);
        }
        for(int i = 0 ; i<s.length();i++){
            if(freq.get(s.charAt(i))==1) {
                return i;
            }
        }
        return -1;
    }
}