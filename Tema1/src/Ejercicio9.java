import java.util.Scanner;

//Realizar un programa que lea un número entero entre 0 y 10 y visualice su
//tabla de multiplicar.

public class Ejercicio9 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame un numero");
        int num1 = teclado.nextInt();
        for (int num = 0; num <= 10; num++){
            int num2 = num1*num;
            System.out.println(num1 + "*" +  num +  "="  + num2);
        }
    }
}

