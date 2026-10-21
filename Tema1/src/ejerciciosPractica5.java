import java.util.Scanner;

//Realizar un programa que solicite dos números, base y exponente, enteros
//positivos (incluido el 0), y que calcule la potencia (base elevado a
//exponente) a través de productos. Si los datos son incorrectos deberán
//volverse a solicitar.

public class ejerciciosPractica5 {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int base;
        int exponente;

        do {
            System.out.println("Dame un numero entero positivo para la base");
            base = tec.nextInt();
            System.out.println("Dame un numero entero positivo para el exponente");
            exponente = tec.nextInt();
        }while (base <0  ||  exponente < 0);
    }
}
