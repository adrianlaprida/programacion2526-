import java.util.Locale;
import java.util.Scanner;

public class Ejercicio15 {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int numero;
        int menor = 0;
        String respuesta;
        boolean esValido = true;

        do {
            System.out.println("Dame un numero");
            numero = tec.nextInt();;
            if (esValido || numero < menor) {
                menor = numero;
                esValido = false;
            }
            do {
                System.out.println("Desea introducir otro numero (S o N)");
                respuesta = tec.next().toUpperCase();
                //toUpperCase es para que lea matuscula siempre
            } while (!respuesta.equals("S") && !respuesta.equals("N"));
        } while (respuesta.equals("S"));

        System.out.println("El numero menor " + menor);
    }
}