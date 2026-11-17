package RelacionMatrices;

//Crea un método que reciba una matriz e imprima, en una sola línea, los elementos de la
//misma, leídos por filas:
//1 3 5 --> La salida es: 1 3 5 0 2 7
//0 2 7

import java.util.Scanner;

public class Ejercicio3 {
    static Scanner tec = new Scanner(System.in);
    static int contador = 0;

    static void main(String[] args) {
        int matriz [] [] = {{1,2,6}, {4,5,6}};
        int[][] solucion = leerLineaMatriz(matriz);
    }

    public static int [] [] leerLineaMatriz(int[] [] matriz){

        for (int i = 0; i <matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                contador = matriz[i][j];
                System.out.print(contador + " ");
            }
        }
        return matriz;
    }
}

