class Solution {
    public String reverseWords(String s) {

        s = s.trim();
        String words[] = s.split("\\s+");
        List<String> wordList = Arrays.asList(words);
       Collections.reverse(wordList);
        return String.join(" ", wordList);
    }
}