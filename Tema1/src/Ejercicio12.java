import java.util.Scanner;

//Realizar un programa que solicite números hasta que se introduzca un
//número negativo. Cuando termine informará de cuantos números positivos
//se han introducido. En este programa el número 0 se considera positivo.

public class Ejercicio12 {
    static void main(String[] args){
        Scanner tec = new Scanner(System.in);
       boolean salir = false;
       int numeros = 0;

       String input = "";
       while (!salir) {
           System.out.println("Escribe numeros positivos y despues un negativo");
           int n = tec.nextInt();

           if (n<0) {
               salir = true;
           }else {
               numeros++;
           }
       }
        System.out.println("Has metido " + numeros + " numeros positivos");
    }
}
