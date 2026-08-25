package PracticeQuestions.Day1.MiniProblems;

import java.util.Scanner;

public class GSTCalculatorWithScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Product Price : " );
        double product1stPrice = sc.nextDouble();

        System.out.print("Enter 2nd Product Price : " );
        double product2ndPrice = sc.nextDouble();

        System.out.print("Enter 3rd Product Price : " );
        double product3rdPrice = sc.nextDouble();

        System.out.print("Enter 4th Product Price : " );
        double product4thPrice = sc.nextDouble();

        System.out.print("Enter 5th Product Price : " );
        double product5thPrice = sc.nextDouble();

        double gst = 18;

        double amount = product1stPrice + product2ndPrice + product3rdPrice + product4thPrice + product5thPrice;

        double gstAmount = amount * 18/100;

        double totalAmount = amount + gstAmount;

        System.out.println("Total Bill Amount : " +amount);
        System.out.println("Total GST Amount : " +gstAmount);
        System.out.println("Final Total Amount :" +totalAmount);

    }
}
