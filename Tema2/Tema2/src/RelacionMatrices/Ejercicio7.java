package RelacionMatrices;

//Crea un método que reciba dos matrices, y compruebe si son exactamente iguales.

import java.util.Scanner;

public class Ejercicio7 {
    static Scanner tec = new Scanner(System.in);

    static void main(String[] args) {

        int[][] matriz1 = {{1,2,3,4} , {5,6,7,8}};
        int[][] matriz2 = {{1,2,3,4} , {1,2,3,4}};
    }


    public static boolean compararTamañoMatriz(int[][] matriz1, int[][] matriz2){

        if (matriz1.length != matriz2.length){
            return false;
        }
        for (int i = 0; i < matriz1.length; i++) {
            if (matriz1[i].length != matriz1[i].length){
                return false;
            }
        }
        return true;
    }

    public static boolean comprobarValoresDeMatrices(int[][] matriz1, int[][] matriz2){
        if (!compararTamañoMatriz(matriz1, matriz2)){
            return false;
        }
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                if (matriz1[i][j] != matriz2[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

}
