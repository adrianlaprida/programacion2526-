import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame un numero entero");
        int num1 = teclado.nextInt();
        System.out.println("Dame otro numero entero");
        int num2 = teclado.nextInt();

        if (num1 > num2) {
            System.out.println("El " + num1 + " es mayor que " + num2);
        } else if (num1 < num2) {
            System.out.println("El " + num1 + " es menor que " + num2);
        } else if (num1 == num2) {
            System.out.println("El " + num1 + " es igual que " + num2);
        }

    }
}
