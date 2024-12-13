package basic.exam;

public class Programmers06 {
    public static void main(String[] args) {
        int storage = 5141;
        int usage = 500;
        int[] change = {10, -10, 10, -10, 10, -10, 10, -10, 10, -10};
        int total_usage = 0;
        System.out.println("usage: " + usage);
        System.out.println("change: " + change[1]);
        for (int i = 0; i < change.length; i++) {
            usage = total_usage * (1 - (change[i]+1) / 100);
            total_usage += usage;
            if(total_usage > storage){
            }
        }


    }
}

