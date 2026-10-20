import java.util.Scanner;

public class EjerciciosPractica3 {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Dame un numero de filas para el cuadrado");
        int filas = tec.nextInt();

        for (int i = 0; i < filas; i++){

            for (int j = 0; j < filas ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
