package day07.practice;

public class StringEquals {
    public static void main(String[] args) {
        String username = "Robin";
        String input = "Robin";

        System.out.println("Username Match : " +username.equals(input));

        input = "Amit";

        System.out.println("Username Match : " + username.equals(input));
    }
}
