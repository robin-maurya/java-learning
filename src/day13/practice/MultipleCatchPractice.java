package day13.practice;

public class MultipleCatchPractice {

    public static void main(String[] args) {

        int a = 10;
        int b = 2;

        int[] numbers = {20, 30, 40};

        try {
            System.out.println(a/b);
            System.out.println(numbers[5]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array error");
        } catch (Exception e) {
            System.out.println("General error");
        }
    }
}
