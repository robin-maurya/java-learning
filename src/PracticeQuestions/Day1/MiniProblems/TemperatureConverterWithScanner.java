package PracticeQuestions.Day1.MiniProblems;

import java.util.Scanner;

public class TemperatureConverterWithScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9 / 5 ) + 32;

        System.out.println("Fahrenheit = " + fahrenheit);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheitValue = sc.nextDouble();

        double celsiusValue = (fahrenheitValue - 32) * 5 /9;

        System.out.println("celsius Value is : " +celsiusValue);

        sc.close();
    }
}
