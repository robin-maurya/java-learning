package PracticeQuestions.Day1.Operators;

public class CircleArea {
    public static void main(String[] args) {
        int radius = 4;
        double radiusDec = 6.6;

        double circleArea = 3.14 * (radius * radius);
        double circleAreaDec = 3.14 * (radiusDec * radiusDec);

        System.out.println("Area of a circle = " +circleArea);
        System.out.println("Area of a circle = " +circleAreaDec);
    }
}
