package day16.practice;

@FunctionalInterface
interface NumberCheck {
    boolean check(int number);
}

public class Practice4EvenOdd {

    public static void main(String[] args) {
        NumberCheck isEven = number -> number% 2== 0;

        int num1 = 10;
        int num2 = 7;

        System.out.println(num1+ " is " +(isEven.check(num1) ? "Even" : "Odd"));
        System.out.println(num2+ " is " +(isEven.check(num2) ? "Even" : "Odd"));
    }
}
