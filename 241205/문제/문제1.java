package basic.문제;

public class 문제1 {
    public static void main(String[] args) {
        int[] nums = {3, 29, 38, 12, 57, 74, 40, 85, 61};

        int max = nums[0];
        int maxIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max){
                max = nums[i];
                maxIndex = i;
            }
        }
        System.out.println("최댓값 : " + max + ", " + "인덱스 : " + maxIndex);

        int min = nums[0];
        int minIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min){
                min = nums[i];
                minIndex = i;
            }
        }
        System.out.println("최솟값 : " + min + ", 인덱스 : " + minIndex);
    }
}
