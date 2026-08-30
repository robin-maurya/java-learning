package PracticeQuestions.Day2.Conditions.EllseIf;

public class MarksToGrade {
    public static void main(String[] args) {
        int marks = 80;
        
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade A");
        } else if (marks >= 80 ) {
            System.out.println("Grade B");
        } else if (marks >= 70) {
            System.out.println("Grade C");
        } else if (marks >= 60) {
            System.out.println("Grade D");
        }else {
            System.out.println("Grade F");
        }
    }
}
