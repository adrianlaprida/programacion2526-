package RelacionMatrices;

//Crea un método que sume todas las posiciones de una matriz y devuelva dicho número.

import java.util.Scanner;

public class Ejercicio2 {
    static Scanner tec = new Scanner(System.in);


    static void main(String[] args) {

        int[][] matriz = {{1,5,2,1,1} , {1,1,1,1,1}};

        int resultado = sumarValoresMatriz(matriz);
        System.out.println("El resultado de la suma es " + resultado);

    }


    public static int sumarValoresMatriz(int[][] matriz){
        int sumatorio = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumatorio = matriz[i][j] + sumatorio;
            }
        }
        return sumatorio;
    }

}
