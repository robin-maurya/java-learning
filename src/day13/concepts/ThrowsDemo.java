package day13.concepts;
import java.io.IOException;
public class ThrowsDemo {
    static void performOperation() throws IOException {
        throw new IOException("Demo checked exception.");
    }
    public static void main(String[] args) {
        try {
            performOperation();
        } catch (IOException e) {
            System.out.println("Handled: " + e.getMessage());
        }
    }
}
