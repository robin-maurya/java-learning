package PracticeQuestions.Day2.Conditions.Nestedif;

public class LoginSystem {
    public static void main(String[] args) {
        String username ="admin";
        String password = "12345";

        if (username.equals("admin")) {
            if (password.equals("1234")) {
                System.out.println("Login Successful.");
            } else {
                System.out.println("Incorrect password.");
            }
        } else {
            System.out.println("Incorrect username.");
        }
    }
}
