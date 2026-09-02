package PracticeQuestions.Day3.Loops.dowhile;

import java.util.Scanner;

public class MenuUntilExit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Say Hello");
            System.out.println("2. Say Good Morning");
            System.out.println("3. Say Good Night");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hello!");
                    break;

                case 2:
                    System.out.println("Good Morning!");
                    break;

                case 3:
                    System.out.println("Good Night!");
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}
