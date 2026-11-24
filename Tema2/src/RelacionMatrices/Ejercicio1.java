package RelacionMatrices;

//Crea un método que compruebe si en una matriz hay algún valor negativo, y devuelva un
//valor booleano.

import java.util.Scanner;

public class Ejercicio1 {
    static Scanner tec = new Scanner(System.in);


    static void main(String[] args) {


        int [][] matriz = {{1,4,2,8} , {3,4,5,6}};

        leerMatrizYRespondeUnBooleano(matriz);
        boolean resultado = leerMatrizYRespondeUnBooleano(matriz);
        System.out.println(resultado);

    }

    public static boolean leerMatrizYRespondeUnBooleano(int [][] matriz){
        boolean siHay = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0){
                    siHay = true;
                }
            }
        }
        return siHay;
    }

}
