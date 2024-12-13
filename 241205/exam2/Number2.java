package basic.exam2;

public class Number2 {
    public static void main(String[] args) {
        int totalRolls = 36000;
        int sumDice = 0;
        double probability = 0;
        int[] diceIndex = new int[11];
        for (int i = 1; i <= totalRolls; i++) {
            int dice_1 = (int) (Math.random() * 6 + 1);
            int dice_2 = (int) (Math.random() * 6 + 1);
            sumDice = dice_1 + dice_2;

            diceIndex[sumDice - 2]++;

        }
        for (int i = 0; i < diceIndex.length; i++) {
            probability = (double) diceIndex[i] / totalRolls;
            System.out.println(probability);
        }

    }

}
