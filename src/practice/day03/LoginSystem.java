package practice.day03;

public class LoginSystem {
    public static void main(String[] args) {
        boolean username = true;
        boolean password = false;

        if (username) {
            if (password) {
                System.out.println("Login Successful");
            }else {
                System.out.println("Invalid Password");
            }
        }else {
            System.out.println("Invalid Username");
        }
    }
}
