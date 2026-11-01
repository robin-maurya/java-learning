package day24.concepts;

public class ParseIntValueOf {

    public static void main(String[] args) {

        String age = "25";

        // String to primitive int
        int parsedAge = Integer.parseInt(age);

        // String to Integer object
        Integer wrapperAge = Integer.valueOf(age);

        System.out.println("Parsed Age: " + parsedAge);
        System.out.println("Wrapper Age: " + wrapperAge);

        System.out.println("Age after adding 5: " + (parsedAge + 5));

        //String to primitive double
        double number = Double.parseDouble("99.50");

        //String to Double Object
        Double wrapperNumber = Double.valueOf("199.50");

        System.out.println("Parsed Number: " + number);
        System.out.println("Wrapper Number: " + wrapperNumber);

        System.out.println("Number after adding 5: " + (number + 5));


    }
}
