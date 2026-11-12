package Relacion1;

//Crea un programa que implemente una estructura de pila de números enteros. Una
//estructura de pila es aquella que permite almacenar elementos de la manera “último
//en entrar, primero en salir (LIFO - Last in first out)”. Crea un método main, donde
//hagas llamadas a un método apilar para añadir elementos y otro método desapilar
//para eliminarlos. Muestra el array tras cada una de las operaciones. La pila tendrá
//como máximo 10 números enteros. Ejemplo de utilización:
//pila original -> []
//apilar(3)
//pila -> [3]
//apilar(12)
//pila -> [3, 12]
//desapilar() //Nota que no indicamos qué debe desapilar, pues debe ser siempre el
//último elemento en entrar
//pila -> [3]
//desapilar()
//pila -> []
//desapilar()
//“No hay elementos en la pila”
//-----

import java.util.Arrays;
import java.util.Scanner;

/// / Imagina ahora el siguiente estado
//pila -> [3, 5, 8, 0, -1, 222, 9, 44, 3, 1]
//apilar(23)
//“La pila está llena, no puedo apilar el elemento”


public class Ejercicio13Relacion1 {

    static int contador = 0;

    static Scanner tec = new Scanner(System.in);

    static void main(String[] args) {

        int[] arraryPila = new int[10];

        int eleccion;

        do {
            System.out.println("1.Apilar");
            System.out.println("2.Desapilar");
            System.out.println("3.Salir");

            eleccion = tec.nextInt();

            switch (eleccion) {
                case 1:
                    System.out.println("Has elegido apilar");
                    int numeroAñadido = MiEntradaSalida.leerEntero("Introduce un numero");
                    apilarNumeros(arraryPila, numeroAñadido);
                    System.out.println(Arrays.toString(Arrays.copyOf(arraryPila, contador)));
                    break;
                case 2:
                    desapilarNumeros(arraryPila);
                    System.out.println(Arrays.toString(Arrays.copyOf(arraryPila, contador)));
                    break;
                case 3:
                    System.out.println("Saliendo");
            }
        } while (eleccion != 0);


    }

    public static void apilarNumeros(int[] array1, int numeroAñadido) {
        if (contador == array1.length) {
            System.out.println("La pila esta llena");
        } else {
            array1[contador] = numeroAñadido;
            contador++;
        }
    }

    public static void desapilarNumeros(int[] array2) {
        if (contador == 0) {
            System.out.println("La pila esta vacia");
        } else {
            contador--;
            System.out.println("El numero que se a sacado es " + array2[contador]);
        }
    }
}
