package RelacionMatrices;

//Crea un método que transforme una matriz CUADRADA (tienes que realizar dicha
//comprobación) que recibe por parámetro, en otra, que debe ser su reflejo en diagonal (de
//abajo a la derecha a arriba a la izquierda):
//1 2 3 4 5 4 7 5 0 5
//6 7 8 9 0 5 6 4 9 4
//3 2 1 4 5 --> 8 8 1 8 3
//9 5 8 6 7 9 5 2 7 2
//0 9 8 5 4 0 9 3 6 1

import java.util.Arrays;

public class Ejercicio13 {
    static int[][] matrizInvertida;
    static void main(String[] args) {
        int[][] matriz = {{1,2,3,4,5}, {6,7,8,9,0}, {3,2,1,4,5}, {9,5,8,6,7}, {0,9,8,5,4}};
        if (matrizCuadrada(matriz)) {
            System.out.println("Es cuadrada");
        }else {
            System.out.println("No es cuadrada");
        }
        int[][] resultado = invertirFilasPorColumnas(matriz);
        //System.out.println(Arrays.deepToString(matrizInvertida));
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matrizInvertida[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean matrizCuadrada(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            if (matriz.length != matriz[i].length) {
                return false;
            }
        }
        return true;
    }

    public static int[][] invertirFilasPorColumnas(int[][] matriz1){
        //Asi se crea una matriz que sea igual que otra
        matrizInvertida = new int[matriz1.length][];
        for (int i = 0; i < matriz1.length; i++) {
            matrizInvertida[i] = new int[matriz1[i].length];

        }

        for (int i = 0; i < matrizInvertida.length; i++) {
            for (int j = 0; j < matrizInvertida[i].length; j++) {
                matrizInvertida[i][j] = matriz1[matrizInvertida.length -1 -j][matrizInvertida.length -1 -i];
            }
        }
        return matrizInvertida;
    }
}
