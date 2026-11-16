package Relacion1;

//Crea un programa que implemente una estructura de cola de números enteros. Una
//estructura de cola es aquella que permite almacenar elementos de la manera
//“primero en entrar, primero en salir (FIFO - First in first out)”. Crea un método main,
//donde hagas llamadas a un método encolar para añadir elementos y otro método
//desencolar para eliminarlos. Muestra el array tras cada una de las operaciones. La
//cola tendrá como máximo 10 números enteros. Ejemplo de utilización:
//cola original -> []
//encolar(3)
//cola -> [3]
//encolar(12)
//cola -> [3, 12]
//desencolar() //Nota que no indicamos qué debe desencolar, pues debe ser siempre
//el primer elemento en entrar
//cola -> [12]
//desencolar()
//cola -> []
//desencolar()
//“No hay elementos en la cola”
//-----

import java.util.Arrays;
import java.util.Scanner;

/// / Imagina ahora el siguiente estado
//cola -> [3, 5, 8, 0, -1, 222, 9, 44, 3, 1]
//encolar(23)
//“La cola está llena, no puedo encolar el elemento”


public class Ejercicio14Relacion1 {
    static Scanner tec = new Scanner(System.in);
    static int contador = 0;
    static int primero = 0;


    static void main(String[] args) {
        int eleccion;
        int[] array = new int[10];

        do {
            System.out.println("1.Encolar");
            System.out.println("2.Desencolar");
            System.out.println("3.Salir");
            eleccion = tec.nextInt();

            switch (eleccion) {
                case 1:
                    int numeroElegido = MiEntradaSalida.leerEntero("¿Que numero quieres meter en la cola?");
                    encolarNumero(array,numeroElegido );
                    System.out.println(Arrays.toString(Arrays.copyOf(array, contador)));
                    break;
                case 2:
                    desencolarNumero(array);
                    System.out.println(Arrays.toString(array));
                    break;
                case 3:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Invalido");
            }

        } while (eleccion != 0);
    }

    public static void encolarNumero(int[] array, int a) {
        if (contador == 10){
            System.out.println("La cola esta llena");
        }else {
            int posicion = (primero+contador) % array.length;
            array[posicion] = a;
            contador++;
        }
    }

    public static void desencolarNumero(int[] array) {
        if (contador == 0){
            System.out.println("El array esta vacio");
        }else {
            System.out.println("Se ha quitado el numero " + array[primero]);
            array[primero]= 0;
            primero = (primero + 1) % array.length;
            contador--;
        }
    }
}
