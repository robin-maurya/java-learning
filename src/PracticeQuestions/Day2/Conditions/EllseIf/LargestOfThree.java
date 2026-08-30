package PracticeQuestions.Day2.Conditions.EllseIf;

public class LargestOfThree {
    public  static void main(String[] args) {
        int a = 110;
        int b = 1115;
        int c = 20;


        if (a > b && a > c) {
            System.out.println("Largest Number is : " +a);
        } else if ( b > a && b > c) {
            System.out.println("Largest Number is : " +b);
        } else {
            System.out.println("Largest Number is :" +c);
        }
    }
}
