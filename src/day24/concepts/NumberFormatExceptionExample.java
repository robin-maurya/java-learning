package day24.concepts;

public class NumberFormatExceptionExample {

    public static void main(String[] args) {

//        String age = "age";
//        String age = "25";
        String age = "25.5";

//        try {
//            int result = Integer.parseInt(age);
//          System.out.println("Age: " + result);
//            double result = Double.parseDouble(age);
//            System.out.println("Double Age: " + result);
//
//        } catch (NumberFormatException e) {
//            System.out.println("Invalid number format!");
//        }

        try {
            int result = Integer.parseInt(age);
            System.out.println("Integer Age: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer format!");
        }

        try {
            double result = Double.parseDouble(age);
            System.out.println("Double Age: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid double format!");
        }

        System.out.println("Program continues...");
    }
}
