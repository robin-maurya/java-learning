package PracticeQuestions.Day2.Conditions.IfElse;

import java.util.Scanner;

public class GreaterThan100WithScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number :" );
        int number = sc.nextInt();

        if (number > 100 ) {
            System.out.println("This Number is Greater Than 100 ");
        }
        else {
            System.out.println("This Number is Not Greater Than 100 ");
        }
    }
}
