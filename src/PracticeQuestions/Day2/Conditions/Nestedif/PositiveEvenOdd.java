package PracticeQuestions.Day2.Conditions.Nestedif;

public class PositiveEvenOdd {
 public static void main(String[] args) {

  int number = 27;

  if (number >= 0) {
   if (number % 2==0 ) {
    System.out.println("Number is positive and it is even");
   } else {
    System.out.println("Number is positive and it is Odd");
   }
  } else {
   System.out.println("This number is Not Positive.");
  }

 }
}
