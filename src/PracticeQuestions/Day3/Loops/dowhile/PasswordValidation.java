package PracticeQuestions.Day3.Loops.dowhile;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctPassword = "Qwerty123";
        String password;

        do {
            System.out.print("Enter Password : ");
            password = sc.nextLine();

            if (password.equals(correctPassword)) {
                System.out.println("Correct Password");
            } else {
                System.out.println("Wrong password. Try again.");
            }
        }while (!password.equals(correctPassword));

        System.out.println("Access granted!");

        sc.close();
    }
}
