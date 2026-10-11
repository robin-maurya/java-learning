package day16.concepts;

@FunctionalInterface
interface Operation {
    int execute(int a, int b);
}

public class LambdaWithMultipleStatements {

    public static void main(String[] args) {

        Operation subtraction = ( a, b ) -> {
            int result = a- b;
            return  result;
        };

        System.out.println(subtraction.execute(50, 20));
    }
}
