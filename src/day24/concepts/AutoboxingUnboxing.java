package day24.concepts;

public class AutoboxingUnboxing {

    public static void main(String[] args) {

        // Autoboxing
        int number = 100;
        Integer wrapperNumber = number;

        System.out.println("Autoboxing: " + wrapperNumber);

        // Unboxing
        Integer value = 200;
        int primitiveValue = value;

        System.out.println("Unboxing: " + primitiveValue);

        // Autoboxing
        double digit = 100.50;
        Double wrapperDigit = digit;

        System.out.println("Autoboxing: " + wrapperDigit);

        // Unboxing
        Double num = 150.50;
        double primitiveNum = num;

        System.out.println("Unboxing: " + primitiveNum);
    }
}
