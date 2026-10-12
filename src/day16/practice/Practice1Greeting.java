package day16.practice;

@FunctionalInterface
interface Greeting {
    void show();
}

public class Practice1Greeting {

    public static void main(String[] args) {
        Greeting greeting = () -> {
            System.out.println("Hello, Java Developer!");
        };

        greeting.show();
    }
}
