package day25.practice;

import java.util.Scanner;

public class MultiCatchPractice2 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter array index: ");
            String input = scanner.nextLine();

            int index = Integer.parseInt(input);

            int[] numbers = {100, 200, 300, 400};

            System.out.println("Result: " + numbers[index]);

        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}
