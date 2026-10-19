import java.util.Locale;
import java.util.Scanner;


//Realizar un programa que solicite un conjunto de números. Después de
//introducir cada número se realizará la pregunta: "¿Desea introducir más
//números (S/N)". Si la respuesta es 'S' se solicitará otro número. Cuando no
//desee introducir más números debe informar cual es el menor de los
//números introducidos.

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