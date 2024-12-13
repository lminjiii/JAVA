package basic.myPackage;

public class DiceProblem {
    public static void main(String[] args) {
        final int TIMES = 70000;
        int[] dice = new int[11];
        int diceOne = 0;
        int diceTwo = 0;
        int diceSum = 0;

        for (int i = 1; i  <= TIMES; i++) {
            diceOne = ((int)(Math.random()*6)) + 1;
            diceTwo = ((int)(Math.random()*6)) + 1;
            diceSum = diceOne + diceTwo;
            dice[diceSum - 2] = dice[diceSum - 2] + 1;
        }
        System.out.println("Output : ");
        double rate = 0.0;
        String strRate = "";
        for (int i = 0; i < dice.length; i++) {
            rate = (double) dice[i] / TIMES;
            strRate = String.format("%.6f", rate);
            System.out.println((i + 2) + " : " + dice[i] +"(" + strRate + ")");
        }
    }
}

