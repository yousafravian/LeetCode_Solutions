package easy;

public class Palindrome_Number {

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;

        int originalNum = x, reversedNum = 0, remainder;
        while (x != 0) {
            remainder = x % 10;
            reversedNum = reversedNum * 10 + remainder;
            x /= 10;
        }
        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1000021));
    }
}
