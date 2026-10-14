import java.util.Scanner;

public class Ejercicio11 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        do {
            System.out.println("Dame un numero positivo");
            num = teclado.nextInt();
            if (num <= 0) {
                System.out.println("Numero incorrecto debe der positivo");
            }

        }while(num <=0);

        }
    }
