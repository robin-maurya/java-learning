package day04.concepts;

public class NestedLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <=3; i++) {
            System.out.println("Outer Loop :" +i);

            for ( int j =1; j<=3; j++) {
                System.out.println("    Inner Loop :" +j);
            }
        }
    }
}
