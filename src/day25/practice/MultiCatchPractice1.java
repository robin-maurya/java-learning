package day25.practice;

public class MultiCatchPractice1 {

    public static void main(String[] args) {

        String input = "Java123";
        int[] numbers = {10, 20, 30};

        try {
            int number = Integer.parseInt(input);

            System.out.println(numbers[number]);

        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}
