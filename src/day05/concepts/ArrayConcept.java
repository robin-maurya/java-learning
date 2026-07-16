package day05.concepts;

public class ArrayConcept {
    public static void main(String[] args) {

        // Array Declaration
        int[] numbers;

        // Array Initialization
        numbers = new int[5];

        // Assign Values
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Access Values
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        // Length Property
        System.out.println("Length : " + numbers.length);
    }
}
