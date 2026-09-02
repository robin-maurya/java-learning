package PracticeQuestions.Day3.Loops.dowhile;

import java.util.Scanner;

public class RepeatUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;

         do {
             System.out.print("Enter Number : ");
              number = sc.nextInt();
         } while (number !=0);
    }
}
