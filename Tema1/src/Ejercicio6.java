import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame un numero");
        int num1 = teclado.nextInt();
        System.out.println("Dame un numero");
        int num2 = teclado.nextInt();
        System.out.println("Dame un numero");
        int num3 = teclado.nextInt();
        System.out.println("Dame un numero");
        int num4 = teclado.nextInt();


        double media = (double)(num1 + num2 + num3 + num4)/ 4;
        System.out.println("La media de los numeros es " + media);
        if (num1 > media) {
            System.out.println("El primer numero " + num1 + " es mayor que la media");
        }
        if (num2 > media) {
            System.out.println("El primer numero " + num2 + " es mayor que la media");
        }
        if (num3 > media) {
            System.out.println("El primer numero " + num3 + " es mayor que la media");
        }
        if (num4 > media) {
            System.out.println("El primer numero " + num4 + " es mayor que la media");
        }


    }
}


