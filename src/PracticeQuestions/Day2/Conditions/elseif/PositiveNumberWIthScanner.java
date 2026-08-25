package PracticeQuestions.Day2.Conditions.elseif;

import java.util.Scanner;

public class PositiveNumberWIthScanner {
    public  static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number :" );
        int number = sc.nextInt();

        if (number >= 0) {
            System.out.println("THis Number is Positive Number:" +number);
        } else {
            System.out.println("This Number is Not Positive Number " +number);
        }
        sc.close();
    }
}
