package day05.practice;

public class AverageOfArray {
    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50};
        int sum = 0;
        int average = 0;

        for(int i=0; i<numbers.length; i++) {
            sum = sum + numbers[i];
        }

        average = sum / numbers.length;
        System.out.println("Sum :" +sum);
        System.out.println("Average :" +average);
    }
}
