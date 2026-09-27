package day13.concepts;
import java.io.FileReader;
import java.io.IOException;
public class CheckedUncheckedException {
    public static void main(String[] args) {
        // Checked exception: must be caught or declared.
        try (FileReader reader = new FileReader("sample.txt")) {
            System.out.println("File opened.");
        } catch (IOException e) {
            System.out.println("Checked: " + e.getMessage());
        }
        // Unchecked exception: compiler does not require handling.
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Unchecked: " + e.getMessage());
        }
    }
}
