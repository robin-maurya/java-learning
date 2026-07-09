package practice;

import java.util.Scanner;

public class StudentPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of Subject 1: ");
        double s1 = sc.nextDouble();

        System.out.print("Enter marks of Subject 2: ");
        double s2 = sc.nextDouble();

        System.out.print("Enter marks of Subject 3: ");
        double s3 = sc.nextDouble();

        System.out.print("Enter marks of Subject 4: ");
        double s4 = sc.nextDouble();

        System.out.print("Enter marks of Subject 5: ");
        double s5 = sc.nextDouble();

        double total = s1 + s2 + s3 + s4 + s5;
        double percentage = total / 5;

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");

        sc.close();
    }
}
