import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {
    public static void main(String[] args) {
        BufferedReader bffRead = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Introduce un número para calcular los n números naturales que hay antes que él:");
            String input = bffRead.readLine();
            int numero = Integer.parseInt(input);
            int suma=suma(numero);
            System.out.println("La suma de los " + numero + " naturales es" + suma);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int suma(int n) {
        if ( n==0){
            return 0;
        } else {
            return n + suma(n-1);
            
    }
}
}