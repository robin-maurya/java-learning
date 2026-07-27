package day07.concepts;

public class StringIntroduction {
    public static void main(String[] args) {

        // String Declaration
        String name = "Robin";

        // Print String
        System.out.println("Name : " + name);

        // length()
        System.out.println("Length : " + name.length());

        // charAt()
        System.out.println("First Character : " + name.charAt(0));

        // equals()
        System.out.println("Equals : " + name.equals("Robin"));

        // equalsIgnoreCase()
        System.out.println("Equals Ignore Case : " + name.equalsIgnoreCase("robin"));

        // toUpperCase()
        System.out.println("Uppercase : " + name.toUpperCase());

        // toLowerCase()
        System.out.println("Lowercase : " + name.toLowerCase());

        // contains()
        System.out.println("Contains 'Rob' : " + name.contains("Rob"));

        // substring()
        System.out.println("Substring : " + name.substring(1));

    }
}
