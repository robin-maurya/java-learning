package PracticeQuestions.Day2.Conditions.EllseIf;

public class SmallestOfThree {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 20;

        if ( a < b && a < c) {
            System.out.println("Smallest Number is : " +a);
        } else if (b < a && b < c) {
            System.out.println("Smallest Number is :" +b);
        } else {
            System.out.println("Smallest Number is :" +c);
        }
    }
}
