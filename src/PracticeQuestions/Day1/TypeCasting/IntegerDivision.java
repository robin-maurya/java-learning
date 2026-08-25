package PracticeQuestions.Day1.TypeCasting;

public class IntegerDivision {
    public static void main(String[] args) {

        int a = 10;
        int b= 3;

        int result = a/b;

        System.out.println("Int result of a / b = " +result);

        System.out.println();

        //Modify the above program so that the result is 3.333...

        System.out.println("Modify the above program so that the result is 3.333...");

        double results = (double) a/b;

        System.out.println("Double result of a / b = " +results);
    }
}
