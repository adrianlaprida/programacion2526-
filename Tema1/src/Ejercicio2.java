import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        double n1 = Double.parseDouble(Scanner.nextLine());

        System.out.println("Introduce otro numero");
        double n2 = Double.parseDouble(Scanner.nextLine());

        double suma = n1 + n2;
        double resta = n1 - n2;
        double multiplicacion = n1 * n2;
        double division = n1/n2;

        System.out.println("La suma es " + suma);
        System.out.println("La resta es " + resta);
        System.out.println("La multiplicacion es " + multiplicacion);
        System.out.println("La division es " + division);

    }



}
