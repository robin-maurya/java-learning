package day13.practice;

public class BankDemo {

    static void withdraw(int balance, int amount)
        throws InsufficientBalanceException {

        if (amount >balance) {
            throw new InsufficientBalanceException(
                    "Insufficient balance"
            );
        }
        System.out.println("Withdrawal successful");
    }

    public static void main(String[] args) {

        try {
            withdraw(5000, 7000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
