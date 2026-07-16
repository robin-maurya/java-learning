package day05.practice;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        int evenIndexSum = 0;
        int evenValueSum = 0;


        //Even index value sum
        for (int i = 0; i < numbers.length; i++) {
            if (i%2==0) {
                evenIndexSum = evenIndexSum + numbers[i];
            }

            if (numbers[i] % 2 == 0){
                evenValueSum= evenValueSum+numbers[i];
            }
        }

        System.out.println("Even Index Sum : " + evenIndexSum);
        System.out.println("Even Value Sum : " + evenValueSum);

    }
}
