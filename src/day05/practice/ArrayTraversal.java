package day05.practice;

public class ArrayTraversal {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};

//Loop 1
        System.out.println("Loop 1");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }



        //Loop 2
        System.out.println("Loop 2");

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }


        //Loop 3

        System.out.println("Loop 3");

        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
