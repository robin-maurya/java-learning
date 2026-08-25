package PracticeQuestions.Day1.TypeCasting;

public class DecimalDivision {
    public static void main(String[] args) {

        //Modify the above program so that the result is 3.333...
        int a = 10;
        int b= 3;

        double results = (double) a/b;

        System.out.println("Modify the above program so that the result is 3.333...");

        System.out.println("Double result of a / b = " +results);
    }
}
