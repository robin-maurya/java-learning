package day16.practice;

@FunctionalInterface
interface SumOperation {
    int calculate(int a, int b);
}

public class Practice7MultipleStatements {

    public static void main(String[] args) {

        SumOperation sumOperation = (a, b) -> {
            int sum = a + b;

            System.out.println("Sum : " +sum);
            return sum;
        };

        int result = sumOperation.calculate(15, 25);


        System.out.println("Returned value: " +result);
    }
}
