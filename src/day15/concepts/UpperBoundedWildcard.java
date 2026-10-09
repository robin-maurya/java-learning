
package day15.concepts;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcard {

    public static double sum(List<? extends Number> numbers) {
        double total = 0;

        for (Number number : numbers) {
            total += number.doubleValue();
        }

        return total;
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(10, 20, 30);
        List<Double> decimals = Arrays.asList(1.5, 2.5, 3.5);

        System.out.println("Integer sum: " + sum(integers));
        System.out.println("Double sum: " + sum(decimals));
    }
}
