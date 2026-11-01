package day24.concepts;

public class WrapperClassExample {

    public static void main(String[] args) {

        int number = 100;
        Integer wrapperNumber = 200;

        double price = 90.50;
        Double wrapperPrice = 199.50;

        boolean name = true;
        Boolean wrapperName = true;

        char word ='R';
        Character wrapperWord = 'R';


        System.out.println("Primitive int: " + number);
        System.out.println("Wrapper Integer: " + wrapperNumber);

        System.out.println("Primitive double: " + price);
        System.out.println("Wrapper Double: " + wrapperPrice);

        System.out.println("Primitive boolean: " + name);
        System.out.println("Wrapper Boolean: " + wrapperName);

        System.out.println("Primitive char: " + word);
        System.out.println("Wrapper Character: " + wrapperWord);
    }
}
