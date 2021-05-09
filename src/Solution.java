class Solution {

    public static int maximumSwap(int num) {
        char[] temp = (num + "").toCharArray();
        for (int i = 0; i < temp.length - 1; i++) {
            int maxIndex = i + 1;
            for (int j = i + 1; j < temp.length; j++) {
                if (temp[maxIndex] < temp[j]) {
                    maxIndex = j;
                }
            }
            if (temp[maxIndex] > temp[i]) {
                int val = temp[maxIndex];
                temp[maxIndex] = temp[i];
                temp[i] = (char) val;
                return Integer.parseInt(String.valueOf(temp));
            }
        }
        return Integer.parseInt(String.valueOf(temp));
    }


    public static void main(String[] args) {

//        System.out.println(maximumSwap(1993));


    }
}