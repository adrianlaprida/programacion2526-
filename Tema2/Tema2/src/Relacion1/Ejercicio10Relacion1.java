package Relacion1;


//Crea un array que devuelva un nuevo array donde se hayan eliminado los elementos
//duplicados del primero.

import java.util.Scanner;

public class Ejercicio10Relacion1 {
    static void main(String[] args) {
        int[] arrayUno = {1,1,5,5,3,3,4,4};
        int[] arrayDos = new int[arrayUno.length];
        int contador = 0;
        boolean repetido;

        for (int i = 0; i < arrayUno.length; i++) {

            repetido = false;

            for (int j = 0; j <contador ; j++) {

                if (arrayUno[i] == arrayDos[j]){
                    repetido = true;
                }
            }
            if (!repetido){
                arrayDos[contador] = arrayUno[i];
                contador++;
            }
        }
        for (int i = 0; i < contador; i++) {
            System.out.println(arrayDos[i]);

        }
    }

}
