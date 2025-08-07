class Solution {
     public static int lengthOfLongestSubstring(String s) {
     int end =0;
        int start =0;
        int maxLength =0;
        List<Character> list = new ArrayList<>();
        while(end<s.length()){
            if (!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
                maxLength = Math.max(maxLength,list.size());

            }
            else {
                list.remove(Character.valueOf(s.charAt(start)));
                start++;

            }
        }
        return maxLength;
    }
}