package medium;

/*
https://leetcode.com/problems/string-to-integer-atoi/
 */
public class String_to_Integer_atoi {

    public static int myAtoi(String s) {
        if (s == null || s.isBlank() || s.isEmpty()) return 0;
        s = s.trim();

        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && s.charAt(0) == '-') continue;
            if (!Character.isDigit(s.charAt(i))) s = s.substring(0, i);
        }


        return 0;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("-123abc"));
        System.out.println(myAtoi("-aabc"));
        System.out.println(myAtoi("-0"));
        System.out.println(myAtoi("-91283472332"));
        System.out.println(myAtoi("91283472332"));
        System.out.println(myAtoi("91283472332"));
        System.out.println(myAtoi("words and 987"));
    }
}
