package PracticeQuestions.Day2.Conditions.Switch;

import java.util.Scanner;

public class BankingMenu {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        double balance = 150000;

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Balance = " + balance);
                break;

            case 2:
                System.out.println("Deposit selected.");
                break;

            case 3:
                System.out.println("Withdraw selected.");
                break;

            case 4:
                System.out.println("Thank you!");
                break;

            default:
                System.out.println("Invalid choice.");
        }
        sc.close();
    }
}
