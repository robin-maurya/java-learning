package day17.practice;

import java.util.function.Function;

public class Practice2StringLength {

    public static void main(String[] args) {

        Function<String, Integer> getLenght = text ->text.length();

        int result = getLenght.apply("Functional Interfaces");
        int result2 = getLenght.apply("Java");

        System.out.println("Length od Functional Interfaces :" +result);
        System.out.println("Length of Java: " +result2);
    }
}
