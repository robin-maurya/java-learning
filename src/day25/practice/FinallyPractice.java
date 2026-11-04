package day25.practice;

public class FinallyPractice {

    public static int calculate() {
        try {
            System.out.println("Inside try");
            return 100;
        } finally {
            System.out.println("Inside finally");
            return  200;
        }
    }

    public static void main(String[] args) {
        int result = calculate();
        System.out.println("Result: " + result);
    }

}
