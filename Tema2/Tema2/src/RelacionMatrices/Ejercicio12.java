package RelacionMatrices;

//Crea un método que transforme una matriz CUADRADA (tienes que realizar dicha
//comprobación) que recibe por parámetro, en otra, que debe ser su reflejo en diagonal (de
//arriba a la izquierda a abajo a la derecha):
//1 2 3 4 5 1 6 3 9 0
//6 7 8 9 0 2 7 2 5 9
//3 2 1 4 5 --> 3 8 1 8 8
//9 5 8 6 7 4 9 4 6 5
//0 9 8 5 4 5 0 5 7 4

import java.util.Arrays;

public class Ejercicio12 {
    static int[][] matrizInvertida;
    static void main(String[] args) {
        int[][] matriz = {{5,6}, {2, 3}};
        if (matrizCuadrada(matriz)) {
            System.out.println("Es cuadrada");
        }else {
            System.out.println("No es cuadrada");
        }
        int[][] resultado = invertirFilasPorColumnas(matriz);
        System.out.println(Arrays.deepToString(matrizInvertida));
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
                matrizInvertida[i][j] = matriz1[j][i];
            }
        }
        return matrizInvertida;
    }

}
