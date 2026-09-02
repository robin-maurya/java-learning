package PracticeQuestions.Day3.Loops.whileloop;

import java.util.Scanner;

public class SumOneToN {
    public static void main(String[] args) {
        int i = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number :");
        int n = sc.nextInt();

        int sum = 0;

        while (i<=n) {
            sum= sum+i;

            i++;
        }

        System.out.println(sum);
    }
}
