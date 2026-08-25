package PracticeQuestions.Day1.Operators;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        a = a + b; // 10+15=25

        b = a - b; // 25-15=10

        a = a - b; //25-10= 15

        System.out.println("a = " +a);
        System.out.println("b = " +b);
    }

}
