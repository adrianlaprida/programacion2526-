import java.util.Locale;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame una letra en miniscula");
        char letra = teclado.nextLine().charAt(0);
        if (letra == 'a') {
            System.out.println("Tu " + letra + " es la primera vocal");
        } else if (letra == 'e') {
            System.out.println("Tu " + letra + " es la segunda vocal");
        } else if (letra=='i') {
            System.out.println("Tu " + letra + " es la tercera vocal");
        }else if (letra=='u') {
            System.out.println("Tu " + letra + " es la cuarta vocal");
        } else if (letra=='o') {
            System.out.println("Tu " + letra + " es la quinta vocal");
        } else{
            System.out.println("Tu letra no es una vocal");
        }

    }

}

