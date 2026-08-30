package PracticeQuestions.Day2.Conditions.EllseIf;

public class DivisibleByFiveAndTen {
    public static void main(String[] args) {
        int number = 15;

        if (number % 5 == 0 && number % 10 == 0) {
            System.out.println("number is divisible by both 5 and 10.");
        }
        else {
            System.out.println("number is Not divisible by both 5 and 10.");
        }
    }
}
