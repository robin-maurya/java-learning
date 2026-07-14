package day04.practice;

public class RightAlignedFlipTriangle {
    public static void main(String[] args) {

        for (int row = 5; row >= 1; row--) {

            for (int space = 1; space <= 5 - row; space++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
