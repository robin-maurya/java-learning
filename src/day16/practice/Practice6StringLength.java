package day16.practice;

@FunctionalInterface
interface StringLength {
   int getLength(String text);
}

public class Practice6StringLength {

    public static void main(String[] args) {

        StringLength length = text -> text.length();

        System.out.println("Length of Java: " + length.getLength("Java"));
        System.out.println("Length of Lambda Expression: " + length.getLength("Lambda Expression"));
    }
}
