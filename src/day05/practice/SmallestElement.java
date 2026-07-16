package day05.practice;

public class SmallestElement {
    public static void main(String[] args) {

        int[] numbers = {10, 50, 20, 80, 30};
        int smallest = numbers[0];

        for (int i=0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println(smallest);
    }
}
