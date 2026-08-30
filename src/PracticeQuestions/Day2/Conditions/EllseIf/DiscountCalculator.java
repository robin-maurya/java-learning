package PracticeQuestions.Day2.Conditions.EllseIf;

public class DiscountCalculator {
    public static void main(String[] args) {
        double amount = 5000;
        double discount;
        
        if (amount >= 5000) {
            discount = 20;
        } else if (amount >= 3000) {
            discount = 15;
        } else if (amount >= 1000) {
            discount = 10;
        }
        else {
            discount = 0;
        }

        double discountAmount = amount * discount / 100;
        double finalAmount = amount - discountAmount;

        System.out.println("Shopping Amount = ₹" + amount);
        System.out.println("Discount = " + discount + "%");
        System.out.println("Discount Amount = ₹" + discountAmount);
        System.out.println("Final Amount = ₹" + finalAmount);
    }
}
