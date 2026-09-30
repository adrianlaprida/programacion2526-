import java.util.Scanner;

public class Ejercicio1 {
public static void main(String[] arg) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un numero entero");
    int num1 = teclado.nextInt();
    System.out.println("Introduce otro numero entero");
    int num2 = teclado.nextInt();
    System.out.println("La suma es " + (num1 + num2));
    System.out.println("La resta es " + (num1 - num2));
    System.out.println("La multiplicacion es " + (num1 * num2));
    System.out.println("La division es " + (num1 / num2));
    }
}


