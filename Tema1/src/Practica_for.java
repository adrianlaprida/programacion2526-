import java.sql.SQLOutput;
import java.util.Scanner;

public class Practica_for {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int suma = 0;
        for (int num = 1; num <= 10; num++){
            suma = suma + num;
        }
        System.out.println("La suma es igual a " + suma);
    }
}
