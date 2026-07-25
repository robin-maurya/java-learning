package day07.practice;

public class StringCharAt {
    public static void main(String[] args) {
        String language = "Java";

        System.out.println("First Character : " +language.charAt(0));
        System.out.println("Second Character :" +language.charAt(1));
        System.out.println("Third Character : " +language.charAt(2));
        System.out.println("Last Character : " + language.charAt(language.length() - 1));;
    }
}
