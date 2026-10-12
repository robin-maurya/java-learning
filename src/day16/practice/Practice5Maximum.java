package day16.practice;

@FunctionalInterface
interface Maximum {
    int findMax(int a, int b);
}

public class Practice5Maximum {

    public static void main(String[] args) {

        Maximum maxNumber = (a, b) -> Math.max(a, b);

//        Maximum max = (a, b) -> a > b ? a : b;   //Ternary operator

        System.out.println("Maximum: " +(maxNumber.findMax(15, 25)));
        System.out.println("Maximum: " +(maxNumber.findMax(40, 12)));

    }
}
