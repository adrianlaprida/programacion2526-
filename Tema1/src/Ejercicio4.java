import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un numero");
        int num1 = teclado.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("EL " + num1 + " es multiplo de 2");
        }
        if (num1 % 3 == 0) {
            System.out.println("El " + num1 + " es multiplo de 3");
        } else {
            System.out.println("El numero no es multiplo de ninguno");
        }
    }
}