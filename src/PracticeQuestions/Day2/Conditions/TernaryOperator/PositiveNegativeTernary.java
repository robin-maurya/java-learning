package PracticeQuestions.Day2.Conditions.TernaryOperator;

import java.util.Scanner;

public class PositiveNegativeTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int number = sc.nextInt();

        String result = (number >= 0)? "Number is Positive " : "Number is Negative ";

        System.out.println(result  +number);

        sc.close();
    }
}
