import java.util.Scanner;

public class Practica_while {
    public void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame un numero");

        int num = teclado.nextInt();
        int num2 = 2;
        boolean encontrado = false;
        while (!encontrado) {
            if (num % num2 == 0) {
                encontrado = true;
            }
            num2++;
        }
        System.out.printf("El primer divisor de %d es %d", num -1 );
    }
}




