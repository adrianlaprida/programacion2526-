import java.util.Scanner;

public class EjerciciosPractica2 {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Introduce un numero para el numero de filas");
        int filas = tec.nextInt();

        for (int i = 0; i < filas; i++) {
            for (int j = 0 ; j < filas -i-1; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
