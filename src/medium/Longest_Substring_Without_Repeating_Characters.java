package medium;

import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> substring = new HashSet<>();
        int left = 0;
        int right = 0;
        int MaxSubStringSize = 0;


        while (right < s.length()) {

            if (!substring.contains(s.charAt(right))) {
                substring.add(s.charAt(right));
                MaxSubStringSize = Math.max(MaxSubStringSize, substring.size());
                right++;
            } else {
                substring.remove(s.charAt(left));
                left++;
            }
        }
        return MaxSubStringSize;
    }

    public static void main(String[] args) {

    }
}
