package day18.practice;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Practice4ConstructorReference {

    public static void main(String[] args) {

        Supplier<ArrayList<String>> listSupplier =ArrayList::new;

        ArrayList<String> names = listSupplier.get();

        names.add("Robin");
        names.add("Amit");

        System.out.println(names);
    }
}
