package day13.practice;

public class MultipleCatchDemo {
    public static void main(String[] args) {

        try {
            int[] number ={10, 20, 30};
            System.out.println(number[5]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid");
        }
        System.out.println("Program continues...");
    }
}
