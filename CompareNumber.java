package basic.condition;

public class CompareNumber {
    public static void main(String[] args) {
        int intA = 7;
        int intB = 4;
        String teststring = "";
        String nullString = null;
        int temp;
        String result = "intA = " + intA + ", intB = " + intB;
        System.out.println(result);
        if (intA < intB){
            temp = intA;
            intA = intB;
            intB = temp;
        }
        result = "intA = " + intA + ", intB = " + intB;
        System.out.println(result);

    }
}
