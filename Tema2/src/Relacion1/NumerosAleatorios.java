package Relacion1;

import java.util.Random;

public class NumerosAleatorios {

    public static void numeroRandom(int random) {
        //Forma 1: Clase random
        Random r = new Random();
        //Asi se debe poner un numero maximo de rango y te puede dar el 0 pero no el numero maximo, se puede poner un numero negativo.
        System.out.println(r.nextInt());
    }


    public static void numeroRandom2(int random) {
        //Forma 2: Clase Math
        System.out.println((Math.random() * 20) - 10);
    }
}
