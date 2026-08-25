package PracticeQuestions.Day1.Operators;

public class RectanglePerimeter {
    public static void main(String[] args) {

// for whole number
        System.out.println("int for whole number");
        int length = 9;
        int width = 7;

        int perimeter = 2 * (length + width);

        System.out.println("The perimeter of the rectangle is: " + perimeter);

        System.out.println();

        //double for decimal
        System.out.println("Double for decimal number");

        double lenghtDec = 7.4;
        double widthDec = 5.3;

        double perimeterDec = 2 * (lenghtDec + widthDec);

        System.out.println("The perimeter of the rectangle is: " + perimeterDec);
    }
}
