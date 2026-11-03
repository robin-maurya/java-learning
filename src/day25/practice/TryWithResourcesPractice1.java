package day25.practice;

import java.io.BufferedReader;
import java.io.StringReader;
import java.io.IOException;

public class TryWithResourcesPractice1 {

    public static void main(String[] args) {

        String text = "Java Full Stack Developer";

        try (BufferedReader reader =
                     new BufferedReader(new StringReader(text))) {

            String data = reader.readLine();

            System.out.println(data);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}



//Your first task
//Ek Java class banao: TryWithResourcesPractice1.java
//
//Task: BufferedReader aur StringReader use karke try-with-resources implement karo.
//
//        Requirements:
//        1. String "Java Full Stack Developer" ko StringReader mein pass karo.
//2. BufferedReader se text read karo.
//3. Text console par print karo.
//4. try-with-resources use karo.
//5. finally mein manually close mat karna.