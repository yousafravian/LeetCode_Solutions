package medium;

/**
 * https://leetcode.com/problems/zigzag-conversion/
 */
public class ZigZag_Conversion {

    public static String convert(String s, int numRows) {
        StringBuilder builder = new StringBuilder();
        int diff = (numRows <= 2) ? 0 : numRows - 2;

        for (int k = 0; k < numRows; k++) {
            for (int i = 0; s.length() > 0; i++) {
                if (k + ((numRows + diff) * i) > s.length() - 1) {
                    break;
                }
                builder.append(s.charAt((k + (numRows + diff) * i)));
                int index = ((i + 1) * (numRows + diff)) - k;
                if (k > 0 && k < numRows - 1 && index < s.length()) builder.append(s.charAt(index));
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(convert("ABCDEFGHIJKLMNOPQ", 2));
        System.out.println(System.currentTimeMillis() - start);
    }
}
