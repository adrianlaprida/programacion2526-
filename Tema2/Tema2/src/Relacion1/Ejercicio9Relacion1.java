package Relacion1;

//Modifica el método anterior y acepta un parámetro “reverse”, que indique si el array
//debe devolverse ordenado de menor a mayor o al revés.

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio9Relacion1 {
    static void main(String[] args) {
        int[] array1 = {1,6,4,3,2,5}; sw
        boolean reverse = false;
        char sn = MiEntradaSalida.continuarSINO("Quieres ordenarlo al reves (S/N) ");

        if (sn == 'S') {
            reverse = true;
        }
        int[] resultado = burbuja(array1, reverse);
        System.out.println(Arrays.toString(resultado));

    }
    public static int[] burbuja ( int[] array1, boolean reverse){
        int t = 0;
        for (int j = 0; j < array1.length; j++) {
            for (int i = 0; i < array1.length - 1 - j; i++) {
                if (!reverse){
                    if (array1[i] > array1[i + 1]) {
                        t = array1[i];
                        array1[i] = array1[i + 1];
                        array1[i + 1] = t;
                    }
                }else {
                    if (array1[i] < array1[i + 1]) {
                        t = array1[i];
                        array1[i] = array1[i + 1];
                        array1[i + 1] = t;
                    }
                }
            }
        }
        return array1;
    }
}