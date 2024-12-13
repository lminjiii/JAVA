package basic.exam2;

public class Number1 {
    public static void main(String[] args) {
        int[] nums = {3, 29, 38, 12, 57, 74, 40, 85, 6};
        int max = nums[0];
        int indexMax = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                indexMax = i+1;

            }
        }
        System.out.println(max);
        System.out.println(indexMax);
    }
}
