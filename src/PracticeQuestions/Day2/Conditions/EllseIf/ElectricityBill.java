package PracticeQuestions.Day2.Conditions.EllseIf;

public class ElectricityBill {
    public static void main(String[] args) {
        int unit = 301;
        double bill;

        if (unit <= 100 ){
            bill = unit * 5;
        } else if (unit <= 200) {
            bill = unit* 7;
        } else if (unit <= 300) {
            bill = unit*10;
        }
        else {
            bill = unit  * 15;
        }

        System.out.println("Electricity Bill = Rs" +bill);
    }
}
