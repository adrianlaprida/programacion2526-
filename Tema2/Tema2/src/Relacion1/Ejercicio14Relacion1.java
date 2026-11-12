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

import java.util.Scanner;

/// / Imagina ahora el siguiente estado
//cola -> [3, 5, 8, 0, -1, 222, 9, 44, 3, 1]
//encolar(23)
//“La cola está llena, no puedo encolar el elemento”


public class Ejercicio14Relacion1 {
    static Scanner tec = new Scanner(System.in);

    static void main(String[] args) {
        int eleccion;

        do {
            System.out.println("1.Encolar");
            System.out.println("2.Desencolar");
            System.out.println("3.Salir");
            eleccion = tec.nextInt();

            switch (eleccion) {
                case 1:
                    int numeroElegido = MiEntradaSalida.leerEntero("¿Que numero quieres meter en la cola?")
                    encolarNumero();
            }

        } while (eleccion != 0);
    }

    public static void encolarNumero() {

    }

    public static void desencolarNumero() {

    }
}
