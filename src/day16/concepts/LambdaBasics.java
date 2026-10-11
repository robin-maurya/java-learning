package day16.concepts;

@FunctionalInterface
interface Greeting {
    void sayHello();
}

public class LambdaBasics {

    static void main(String[] args) {

        Greeting greeting = () -> {
            System.out.println("Hello java");
        };

        greeting.sayHello();
    }

}
