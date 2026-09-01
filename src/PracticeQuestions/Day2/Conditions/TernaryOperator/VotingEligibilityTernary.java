package PracticeQuestions.Day2.Conditions.TernaryOperator;

import java.util.Scanner;

public class VotingEligibilityTernary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age : ");
        int age = sc.nextInt();

       String eligible = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";

       System.out.println(eligible);
    }
}
