package PracticeQuestions.Day3.Loops.whileloop;


import java.util.Scanner;

public class PrintUntilZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int number = sc.nextInt();

        while (number !=0 ){
            System.out.println(number);

            System.out.print("Enter Number : ");
            number= sc.nextInt();
        }
    }
}
