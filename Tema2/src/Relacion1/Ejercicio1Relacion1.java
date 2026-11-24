package Relacion1;

//Crea un programa que sume todas las posiciones pares de un array de enteros.


import java.util.Scanner;

public class Ejercicio1Relacion1 {
    static Scanner tec = new Scanner(System.in);

    static void main(String[] args) {
        int[] arrayNumeroPares = {1,2,3,4,5,6};
        int resultado = sumaPosicionesPares(arrayNumeroPares);
        System.out.println("La suma es: " + resultado);
    }

    public static int sumaPosicionesPares(int[] arrayNumerosPares){
        int suma = 0;
        for (int i = 0; i < arrayNumerosPares.length ; i++) {
           if (i % 2 ==0){
               suma = suma + arrayNumerosPares[i];
           }
        }
        return suma;
    }
}
