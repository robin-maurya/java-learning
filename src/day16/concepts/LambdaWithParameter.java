package day16.concepts;

@FunctionalInterface
interface Message {
    void display(String text);
}

public class LambdaWithParameter {
    public static void main(String[] args) {

        Message message = text -> System.out.println(text);

        message.display("Learning Lambda Expressions");
    }

}
