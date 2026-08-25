package PracticeQuestions.Day1.MiniProblems;

import java.util.Scanner;

public class StudentAverageMarksWithScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Math Number : ");
        double math = sc.nextDouble();

        System.out.print("Enter English Number : ");
        double english = sc.nextDouble();

        System.out.print("Enter Physics Number : ");
        double physics = sc.nextDouble();

        System.out.print("Enter Hindi Number : ");
        double hindi = sc.nextDouble();

        System.out.print("Enter EVS Number : ");
        double evs = sc.nextDouble();

        double totalNumber = math + english + physics + evs + hindi;

        double avgNumber = totalNumber / 5;

        System.out.println("Total Number : " +totalNumber);
        System.out.println("Average Number : " +avgNumber);

    }
}
