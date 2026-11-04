package day25.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class TryWithResourcesPractice2 {

    public static void main(String[] args) {

        try (
                StringReader stringReader =
                        new StringReader("Learning Java Exception Handling");

                BufferedReader bufferedReader =
                        new BufferedReader(stringReader)
        ) {

            String data = bufferedReader.readLine();

            System.out.println(data);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
