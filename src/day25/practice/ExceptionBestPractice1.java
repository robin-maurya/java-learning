package day25.practice;

public class ExceptionBestPractice1 {

    public static void main(String[] args) {
        String data = "Java123";

        try {
            int number = Integer.parseInt(data);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: String '" + data + "' valid integer nahi hai.");
            System.out.println("System message: " + e.getMessage());
        }
    }
}
