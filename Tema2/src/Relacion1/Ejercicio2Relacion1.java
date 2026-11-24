package Relacion1;

//Crea un programa que detecte cuántos números negativos hay en un array de
//enteros.

import java.util.Scanner;

public class Ejercicio2Relacion1 {
    static Scanner tec = new Scanner(System.in);

    static void main(String[] args) {
        int[] arrayNumerosNegativos = {1,-2,3,-4,5};
        int resultado = cuantosNumerosSonNegativos(arrayNumerosNegativos);
        System.out.println("Hay " + resultado + " numeros negativos");
    }
    public static int cuantosNumerosSonNegativos(int [] array){
        int num = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] < 0 ){
                num += 1;

            }
        }
        return num;
    }
}
