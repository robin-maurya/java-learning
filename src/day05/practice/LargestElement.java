package day05.practice;

public class LargestElement {
    public static void main(String[] args) {

        int[] numbers = {10, 50, 20, 80, 30};
        int largest = numbers[0];

        for (int i=0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println(largest);
    }
}
