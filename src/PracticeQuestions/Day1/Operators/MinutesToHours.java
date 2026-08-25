package PracticeQuestions.Day1.Operators;

public class MinutesToHours {
    public static void main(String[] args) {
        int minutes = 200;

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        System.out.println("Hours = " +hours);
        System.out.println("Remaining Minutes = " +remainingMinutes);

    }
}
