package day07.practice;

public class StringEqualsIgnoreCase {
    public  static void main(String[] args) {
        String password = "Java123";
        String input = "java123";

        System.out.println("Password Match : " +password.equalsIgnoreCase(input));
    }
}
