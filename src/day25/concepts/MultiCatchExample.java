package day25.concepts;

public class MultiCatchExample {
    public static void main(String[] args) {

        String input = "abc";
        int[] numbers = {10, 20, 30};

        try {
            int number = Integer.parseInt(input);

            System.out.println(numbers[number]);

        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}
