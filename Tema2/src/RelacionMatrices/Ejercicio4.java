package RelacionMatrices;

//Crea un método que reciba una matriz e imprima, en una sola línea, los elementos de la
//misma, leídos por filas, empezando por los últimos índices:
//1 3 5 --> La salida es: 7 2 0 5 3 1
//0 2 7

import java.util.Scanner;

public class Ejercicio4 {
    static Scanner tec = new Scanner(System.in);

    static void main(String[] args) {
        int matriz [] [] = {{1,2,6}, {4,5,6}};
        int[][] solucion = leerMatrizPorElUltimoNumeroDeLaUltimaColumna(matriz);
    }

    public static int [] [] leerMatrizPorElUltimoNumeroDeLaUltimaColumna(int[] [] matriz){

        for (int i = matriz.length -1; i >= 0 ; i--) {
            for (int j = matriz[i].length -1; j >= 0; j--) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        return matriz;
    }

}
