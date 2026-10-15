package day17.practice;

import java.util.function.Supplier;

public class Practice4SupplierMessage {

    public static void main(String[] args) {

        Supplier<String> msg = () -> "Java is fun to learn";

        System.out.println(msg.get());
    }
}
