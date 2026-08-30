package PracticeQuestions.Day2.Conditions.EllseIf;

public class LargestOfTwo {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        if (a > b) {
            System.out.println("Largest Number is : " +a);
        }
        else if(b > a ) {
            System.out.println("Largest Number is : " +b);
        }
        else {
            System.out.println("Both Number are Equal. ");
        }
    }
}
