import java.util.Scanner;

public class EjerciciosPractica4 {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Introduce una altura para el cuadrado");
        int altura = tec.nextInt();

        System.out.println("Dame una base para el cuadrado");
        int base = tec.nextInt();

        for (int i = 0; i < altura; i++){
            for (int j = 0; j < base; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
