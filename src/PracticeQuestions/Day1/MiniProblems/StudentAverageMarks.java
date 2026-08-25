package PracticeQuestions.Day1.MiniProblems;

public class StudentAverageMarks {
    public static void main(String[] args) {
        double math = 75;
        double physics = 65;
        double english = 84;
        double hindi = 92;
        double evs = 65;

        double totalNumber = math + physics + english + hindi + evs;
        double avgNumber = totalNumber / 5;

        System.out.println("Math: " +math);
        System.out.println("Physics : " +physics);
        System.out.println("English : " +english);
        System.out.println("HIndi : " +hindi);
        System.out.println("EVS : " +evs);
        System.out.println("Total Number : " +totalNumber);
        System.out.println("Total Average Number : " +avgNumber);
    }
}
