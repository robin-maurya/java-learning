package day24.practice;

public class Practice5EnumMethods {

    enum PaymentStatus {
        PENDING,
        SUCCESS,
        FAILED
    }
    public static void main(String[] args) {

        System.out.println("Available Payment Status:");
        for (PaymentStatus status : PaymentStatus.values()) {
            System.out.println(status);

        }

        PaymentStatus status = PaymentStatus.valueOf("SUCCESS");
        System.out.println("Selected Payment Status: " +status);

        try {
            PaymentStatus status1 = PaymentStatus.valueOf("REFUNDED");
            System.out.println(status1);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid payment status: REFUNDED");
        }
    }
}




//Task:
//        1. Create an enum named PaymentStatus with:
//        - PENDING
//   - SUCCESS
//   - FAILED
//2. Use values() to print all enum constants.
//        3. Use valueOf() to convert the String "SUCCESS" into an enum constant.
//        4. Print the selected payment status.
//5. Try converting "REFUNDED" using valueOf() and handle the exception using try-catch.
//Expected output:
//Available Payment Status:
//PENDING
//        SUCCESS
//FAILED
//
//Selected Payment Status: SUCCESS
//Invalid payment status: REFUNDED