package PracticeQuestions.Day1.MiniProblems;

public class GSTCalculator {
    public static void main(String[] args) {
        double productFirstPrice = 200;
        double product2ndPrice = 100;
        double product3rdPrice = 500;
        double product4thtPrice = 20;
        double product5thPrice = 50;

        double gst = 18;

        double totalBill = productFirstPrice + product2ndPrice + product3rdPrice + product4thtPrice + product5thPrice;

        double gstAmount = totalBill*(gst /100);

        double finalBill = totalBill + gstAmount;

        System.out.println("Total Bill Amount = " + totalBill);
        System.out.println("GST Amount = " + gstAmount);
        System.out.println("Final Bill Amount = " + finalBill);
    }
}
