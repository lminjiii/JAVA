package basic.myPackage;

public class MaxAndMinNumber {
    public static void main(String[] args) {
        int[] num = {3, 29, 38, 12, 57, 74, 40, 85, 61};
        int min = 99999999;
        int minIndex = 0;
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < num.length;  i++) {
            if (num[i] < min){
                min = num[i];
                minIndex = i;
            }
            if (num[i] > max){
                max = num[i];
                maxIndex = i;
            }
        }
        System.out.println("최댓값 : " + max + ", 인덱스 : " + (maxIndex+1));
        System.out.println("최솟값 : " + min + ", 인덱스 : " + (minIndex+1));


    }
}
