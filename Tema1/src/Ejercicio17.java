import java.util.Scanner;


//Realizar un programa que solicite un número entero positivo o cero y
//calcule su factorial. Diseñar el programa de forma que si algún dato es
//incorrecto vuelva a solicitarse.

public class Ejercicio17 {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int num;
        int resultado= 1;

        do {
            System.out.println("Dame un numero positivo");
            num = tec.nextInt();
        }while (num <0);

        for (int i = 1; i <=num; i++){
            resultado = resultado*i;
        }
        System.out.println("El factorial de " + num + " es " + resultado);
    }
}
