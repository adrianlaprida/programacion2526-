import java.util.Scanner;

public class Ejercicio11 {
    static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int num;
        boolean positivo = false;
        do {
            System.out.println("Dame un numero positivo");
            num = teclado.nextInt();
            if (num>0){
             positivo = true;
            }else System.out.println("Has introducido un numero no valido");
        }while (!positivo);
    }
}
