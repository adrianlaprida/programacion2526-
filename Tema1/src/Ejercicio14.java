import java.util.Scanner;

//Realizar un programa que solicite una cantidad de números que van a
//pedirse por teclado. Una vez que solicite todos ellos debe informar de cual
//es la media de los números. Diseñar el programa de forma que si la
//cantidad es incorrecta vuelva a solicitarse.

public class Ejercicio14 {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int contador;

        do {
            System.out.println("Cuantos numeros vas a introducir");
            contador = tec.nextInt();
            if (contador < 0) {
                System.out.println("Numero incorrecto, dame otro que sea positivo");
            }
        }while (contador<=0);

        double suma = 0;
        for (int i = 1; i <=contador; i++){
            System.out.println("Introduce el numero " + i + " :");
            suma = suma + tec.nextInt();
        }
        double media = suma/contador;
        System.out.println("La media de tus numeros es " + media);
    }
}
