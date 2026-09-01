package PracticeQuestions.Day2.Conditions.Nestedif;

public class ValidTriangle {
    public static void main(String[] args) {

        int a = 4;
        int b = 5;
        int c = 6;

        if (a + b > c) {
            if (b + c > a) {
                if (c + a > b) {
                    System.out.println("Valid Triangle.");
                } else {
                    System.out.println("Invalid Triangle.");
                }
            }else {
                System.out.println("Invalid Triangle.");
            }
        } else {
            System.out.println("Invalid Triangle.");
        }
    }
}
