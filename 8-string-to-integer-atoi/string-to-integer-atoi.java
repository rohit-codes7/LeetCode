class Solution {

    public int myAtoi(String s) {
        s = s.trim();
        int i = 0, sign = 1, n = s.length();
        long num = 0;
        if (n == 0) return 0;

        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        while (i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0'); //this line is also handling the leading zeroes.

            if (sign == 1 && num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign == -1 && -num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }

        return (int) (sign * num);
    }
}
