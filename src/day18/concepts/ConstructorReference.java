package day18.concepts;

import java.util.ArrayList;
import java.util.function.Supplier;

public class ConstructorReference {

    public static void main (String[] args) {

        Supplier<ArrayList<String>> listSupplier = ArrayList::new;

        ArrayList<String> names = listSupplier.get();

        names.add("Robin");
        names.add("Amit");
        names.add("Ram");

        System.out.println(names);
    }
}
