package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/***
 * This is an experimental code to analyze how the Stack Trace gets printed even after the
 * last line of this program. It seems, there is Concurrency involved in Exception Handling.
 */
public class PrintStackTraceExampleJava {

    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        try {
            int inputValue = Integer.parseInt(input);
            System.out.println("Parsed value: " + inputValue);
        }  catch (NumberFormatException e) {
            System.out.println("This is a number format exception");
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(input);
    }
}