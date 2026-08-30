package PracticeQuestions.Day2.Conditions.Nestedif;

public class LoginValidation {
    public static void main(String[] args) {
        boolean username = true;
        boolean password = true;

        if (username) {
           if (password) {
               System.out.println("Login Successful");
           } else {
               System.out.println("Invalid Password");
           }
        }else {
            System.out.println("Invalid Username");
        }
    }
}
