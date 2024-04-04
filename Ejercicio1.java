import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter a number: ");
            String input = reader.readLine();
            int number = Integer.parseInt(input);
            System.out.println("You entered: " + number);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}