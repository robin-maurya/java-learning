package day24.concepts;

public class WrapperNullHandling {

    public static void main(String[] args) {

//        Integer number = null;

        Integer number = 100;

        if (number != null) {
            int result = number;
            System.out.println("Number: " + result);
        } else {
            System.out.println("Number is null");
        }

        System.out.println("Program continues...");
    }
}
