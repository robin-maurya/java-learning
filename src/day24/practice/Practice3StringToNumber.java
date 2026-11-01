package day24.practice;

public class Practice3StringToNumber {

    public static void main(String[] args) {

        String firstNumber = "100";
        String secondNumber = "abc";

//        int number1 = Integer.parseInt(firstNumber);
//        int number2 = Integer.parseInt(secondNumber);
//
//        System.out.println("First Number : " +number1);
//        System.out.println("Second Number : " +number2);
//
//        System.out.println("Total: " + (number1 + number2));

        //String to primitive double
//        double number = Double.parseDouble("99.50");

        //String to Double Object
//        Double wrapperNumber = Double.valueOf("99.50");
//
//        System.out.println("Parsed Number: " + number);
//        System.out.println("Wrapper Number: " + wrapperNumber);

        try {
            int number1 = Integer.parseInt(firstNumber);
            int number2 = Integer.parseInt(secondNumber);

            System.out.println("First Number: " + number1);
            System.out.println("Second Number: " + number2);
            System.out.println("Total: " + (number1 + number2));

        } catch (NumberFormatException e) {
            System.out.println("Invalid number format!");
        }

        double decimalNumber = Double.parseDouble("99.50");
        System.out.println("Decimal Number: " + decimalNumber);
    }
}


//Requirements
//1. String firstNumber = "100";
//2. String secondNumber = "200";
//3. Integer.parseInt() se dono ko int mein convert karo.
//        4. Dono numbers ka sum calculate karo.
//        5. Double.parseDouble() se "99.50" ko double mein convert karo.
//        6. Invalid input ko try-catch se handle karo.
//        Expected output
//First Number: 100
//Second Number: 200
//Total: 300
//Decimal Number: 99.5