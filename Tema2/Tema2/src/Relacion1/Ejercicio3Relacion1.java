package Relacion1;


//Crea un programa que pregunte cuántos elementos tendremos en un array de
//enteros. Posteriormente se preguntarán tantos números como haya indicado el
//usuario. Posteriormente, mostraremos por pantalla el mayor, el menor y la media. Si
//el número mayor o menor están repetidos, deberá indicarse cuántas veces se repite.
//Por ejemplo:
//Introduzca las posiciones que tendrá el array: 5
//Introduzca el número 1: 4
//Introduzca el número 2: -1
//Introduzca el número 3: 9
//Introduzca el número 4: 5
//Introduzca el número 5: 9
//El mayor número introducido es 9 (se repite 2 veces)
//El menor número introducido es -1
//La media de los números introducidos es: 5.2

import java.util.Scanner;

public class Ejercicio3Relacion1 {


    static void main(String[] args) {
        int tamano = MiEntradaSalida.enteroPositivo("Cuantos numeros vas a introducir:");
        int[] array = new int[tamano];
        numeroDeEnteros(array);

    }
    public static void numeroDeEnteros(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = MiEntradaSalida.enteroPositivo("Introduce el numero " + (i+1));
        }
        int maximo = Integer.MIN_VALUE;
        int contadorMaximo = 0;
        for (int j = 0; j < array.length; j++) {

        }
    }

}

