package day22.concepts;

public class NullPointerProblem {

    public static void main(String[] args) {

        String name = null;

//        System.out.println(name.length());

        if (name != null) {
            System.out.println(name.length());
        } else {
            System.out.println("Name is not available");
        }
    }
}
