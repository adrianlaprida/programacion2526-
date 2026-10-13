import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        for (int num1 = 1; num1 <= 100; num1++) {
            if (num1 % 7 == 0) {
                System.out.println("El " + num1 + " es multiplo de 7");
            }
            if (num1 % 13 == 0) {
                System.out.println("El " + num1 + " es multiplo de 13");
            }
        }

    }
}