package PracticeQuestions.Day3.Loops.forLoop;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Table of : ");
        int table = sc.nextInt();

        for (int i = 1; i<=10; i++){
            System.out.println(table*i);
        }
        sc.close();
    }
}
