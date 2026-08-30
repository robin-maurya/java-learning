package PracticeQuestions.Day2.Conditions.Nestedif;

public class VotingAndVoterId {
    public static void main(String[] args) {

        int age = 19;
        boolean hasValidVoterId = true;

        if ( age >= 18) {
            if (hasValidVoterId) {
                System.out.println("Eligible to vote and has a valid voter ID.");
            } else {
                System.out.println("Eligible to vote but voter is not valid.");
            }
        } else {
            System.out.println("Not eligible to vote.");
        }
    }
}
