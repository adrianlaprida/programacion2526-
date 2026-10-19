import java.util.Scanner;

//Realizar un programa que lea un número entero positivo y averigüe si es
//perfecto. Un número es perfecto cuando es igual a la suma de sus divisores
//excepto él mismo. Diseñar el programa de forma que si algún dato es
//incorrecto vuelva a solicitarse

public class Ejercicio16 {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num;
        int contador= 0;

        do {
            System.out.println("Dime un numero");
            num = tec.nextInt();

        }while (num <=1);

        for (int i = 1; i<num; i++){

            if (num%i==0){
                contador = contador + i;
            }
        }
        if (contador== num){
            System.out.println("El numero " + num + " es perfecto");
        }else System.out.println("El " + num + " el numero no es perfecto");
    }
}
