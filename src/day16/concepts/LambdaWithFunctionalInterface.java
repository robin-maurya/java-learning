package day16.concepts;

@FunctionalInterface
interface NumberCheck {
    boolean check(int number);
}

public class LambdaWithFunctionalInterface {

     public static void main(String[] args) {

         NumberCheck isEven = number -> number% 2 == 0;

         System.out.println(isEven.check(10));

         System.out.println(isEven.check(7));

     }
}
