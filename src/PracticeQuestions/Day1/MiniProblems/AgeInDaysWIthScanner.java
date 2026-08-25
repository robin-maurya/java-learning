package PracticeQuestions.Day1.MiniProblems;

import java.util.Scanner;

public class AgeInDaysWIthScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age in Year : " );
        int age = sc.nextInt();

        int ageInMonth = age * 365;

        System.out.println("Age in Month : " + ageInMonth);

    }

}
