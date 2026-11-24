package RelacionMatrices;

//Crea un método que reciba una matriz e imprima, en una sola línea, los elementos de la
//misma, pero leídos por columnas:
//1 3 5 --> La salida es: 1 0 3 2 5 7
//0 2 7

import java.util.Scanner;

public class Ejercicio5 {
    static Scanner tec = new Scanner(System.in);

    static void main(String[] args) {
        int matriz [] [] = {{1,2,6}, {4,5,6}};
        int[][] solucion = leerMatrizPorColumnas(matriz);
    }

    public static int [][] leerMatrizPorColumnas(int[] [] matriz){

        for (int j = 0; j <matriz[0].length ; j++) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        return matriz;
    }

}
