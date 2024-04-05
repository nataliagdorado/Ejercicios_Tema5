import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio2 {
    public static void maint(String[] args) {
        BufferedReader bffReader = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print("Introduce un número:");
            String primero=bffReader.readLine();
            int one=Integer.parseInt(primero);

            System.out.print("Introduce otro número:");
            String segundo=bffReader.readLine();
            int two=Integer.parseInt(segundo);
            funcion(one, two);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void funcion(int one, int two) {
        if (one <= two) {
            System.out.println(one);
            funcion(one + 1, two);
        }
    }
    
}
