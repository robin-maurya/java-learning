package PracticeQuestions.Day2.Conditions.IfElse;

import java.util.Scanner;

public class PassFailWithScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Mark : ");
        int mark = sc.nextInt();

        if (mark >= 40) {
            System.out.println("Student has passed");
        }
        else {
            System.out.println("Student has failed");
        }
    }
}
