//package day15.practice;
//
//import java.util.List;
//
//public class GenericMethodPractice6 {
//    public static void printNumbers(List<? extends Number> list ) {
//        for (Number number :list) {
//            System.out.println(number);
//        }
//    }
//
//    public static void addNumbers(List<? super Integer> list) {
//        list.add(100);
//        list.add(200);
//    }
//
//    public static void main(String[] args) {
//        List<Integer> numbers = List.of(10, 20, 30);
//        List<Double> decimals = List.of(10.5, 20.5);
//
//        printNumbers(numbers);
//        printNumbers(decimals);
//    }
//}

package day15.practice;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodPractice6 {

    // Yahan aayegi koi bhi list jo Number ya uski Child ho (Read-Only jaisa)
    public static void printNumbers(List<? extends Number> list ) {
        for (Number number : list) {
            System.out.println(number);
        }
    }

    // Yahan aayegi aisi list jo Integer ya uski Parent ho (Add karne ke liye)
    public static void addNumbers(List<? super Integer> list) {
        list.add(100);
        list.add(200);
    }

    public static void main(String[] args) {
        // List.of() ki jagah new ArrayList() use kiya taaki .add() kaam kare
        List<Integer> numbers = new ArrayList<>(List.of(10, 20, 30));
        List<Double> decimals = new ArrayList<>(List.of(10.5, 20.5));

        // Ek aur list banayi jo Integer ka Parent (Number) hai
        List<Number> myNumbers = new ArrayList<>(List.of(1, 2, 3));

        System.out.println("--- Pehle Print Karte Hain ---");
        printNumbers(numbers);   // ✅ Chalega (Integer is child of Number)
        printNumbers(decimals);  // ✅ Chalega (Double is child of Number)

        System.out.println("\n--- Ab Numbers Add Karte Hain ---");
        addNumbers(numbers);     // ✅ Chalega (Kyunki list Integer ki hai)
        addNumbers(myNumbers);   // ✅ Chalega (Kyunki Number, Integer ka super hai)
        // addNumbers(decimals); // ❌ ERROR: Ye nahi chalega, double list me int nahi jaa sakta!

        System.out.println("Add karne ke baad:");
        printNumbers(numbers);   // Check karo 100 aur 200 add ho gaye!
    }
}