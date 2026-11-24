
//Crea manuyalmente una array de 5 enteros y los muestras por pantalla

import java.util.Scanner;

public class PrimerEjercicioArray {
    static Scanner tec = new Scanner(System.in);


    static void main(String[] args) {
        int[] primeraArray =  {1,2,3,4,5};

        for (int i = 0; i < primeraArray.length ; i++) {
            System.out.println(primeraArray[i]);
        }
    }

}


