package PracticeQuestions.Day1.VariablesDataTypes;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        byte byteValue = 100;  //byte chhoti whole numbers store karta hai. (Isme decimal nahi hota.)
        short shortValue = 1000;  //short bhi whole number store karta hai, lekin byte se bada range hota hai.
        int intValue = 100000;  //int Java mein commonly used whole number data type hai. (10, 500, 100000, -25)
        long longValue = 10000000000L; //long bahut bade whole numbers store karne ke liye use hota hai. (L batata hai ki ye value long type ki hai.)
        float floatValue = 10.5f; //float decimal values store karta hai. (ahan f lagana important hai:  Kyuki Java decimal number ko by default double maanta hai.)
        double doubleValue = 20.55; //double bhi decimal values store karta hai.
        char charValue = 'A'; //char single character store karta hai.
        boolean booleanValue = true; //boolean sirf 2 values store kar sakta hai:

        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println(charValue);
        System.out.println(booleanValue);
    }
}
