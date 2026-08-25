package PracticeQuestions.Day1.MiniProblems;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount : ");
        double principalAmount = sc.nextDouble();

        System.out.print("Enter Interest Rate : ");
        double interestRate = sc.nextDouble();

        System.out.print("Enter Time in Months : ");
        double months = sc.nextDouble();
        double time = months / 12;

        double totalInterest =(principalAmount * interestRate * time) / 100;

        System.out.println("Total Interest = " +totalInterest);

        System.out.println("Total Amount With Interest = " +(principalAmount + totalInterest));

        sc.close();


    }
}
