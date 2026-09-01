package PracticeQuestions.Day2.Conditions.Nestedif;

public class AllSubjectsPassed {
    public static void main(String[] args) {
        int math = 55;
        int english = 50;
        int hindi = 75;

        if ( math >= 40) {
            if (english >= 40) {
                if (hindi >= 40) {
                    System.out.println("Student passed all subjects.");
                }
                else {
                    System.out.println("Student Failed in Hindi.");
                }
            } else {
                System.out.println("Student Failed in English.");
            }
        }else {
            System.out.println("Student Failed in Math.");
        }
    }
}
