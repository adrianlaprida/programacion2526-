import java.util.Scanner;

//Realizar un programa que muestre por pantalla todos los números
//comprendidos entre 1 y 100 que son múltiplos de 7 o de 13. Debe mostrar
//un mensaje indicando si el número es múltiplo de 7 o de 13. Si el número
//es múltiplo de 7 y de 13 a la vez, deben aparecer dos mensajes

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