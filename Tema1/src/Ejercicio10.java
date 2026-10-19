import java.util.Scanner;

//Realizar un programa que solicite una cantidad de números que van a
//introducirse por teclado. Después, para cada uno de ellos que indique si el
//número es par o impar. Si la cantidad de números introducida es 0 o
//negativa volverá a solicitarse el dato.

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean esValido = false;
        int num;
        do {
            System.out.println("Cuantos numeros quieres comprobar");
            num = teclado.nextInt();
            if (num > 0){
                esValido = true;
            }else System.out.println("Has introducido un numero no valido");
        }while (!esValido);

        for (int num1 = 0; num1 < num;num++){
            System.out.println("Introduce el numero");
            int num2 = teclado.nextInt();
            if (num2%2==0){
                System.out.println("Tu numero es par");
            }else System.out.println("Tu numero no es par");
        }
    }
}
