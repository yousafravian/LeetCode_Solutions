package hard;

public class Median_of_Two_Sorted_Arrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];


        if (merged.length % 2 == 0) {
            int index = ((int) merged.length / 2) - 1;
            return ((float) merged[index] + merged[index + 1]) / 2;
        } else {
            return merged[(int) Math.floor((float) merged.length / 2)];
        }
    }

    public static void main(String[] args) {

        int[] a = new int[0];
        int[] b = new int[]{1};
        System.out.println(findMedianSortedArrays(a, b));
    }
}
