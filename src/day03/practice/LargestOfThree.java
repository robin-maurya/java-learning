package day03.practice;

public class LargestOfThree {
    public static void main(String[] args) {
        int a = 30;
        int b = 50;
        int c = 35;

        if(a > b && a > c ) {
            System.out.println("largest number is " +a);
        }
        else if (b > a && b> c){
            System.out.println("largest number is " +b);
        }
        else {
            System.out.println("largest number is " +c);
        }
    }
}
