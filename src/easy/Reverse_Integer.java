package easy;

public class Reverse_Integer {

    public static int reverse(int x) {
        if (x == 0) return 0;
        int abs = Math.abs(x);
        char[] arr = String.valueOf(abs).toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = temp;
        }
        int val = 0;
        try {
            val = Integer.parseInt(((x < 0) ? "-" : "") + String.valueOf(arr));
        } catch (Exception e) {
            return 0;
        }
        return val;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-123456));
        System.out.println(reverse(0));
        System.out.println(reverse(-0));
    }
}
