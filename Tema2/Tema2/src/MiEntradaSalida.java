import java.util.Scanner;

public class MiEntradaSalida {
    public static String leerCadena(String mensaje) {
        Scanner tec = new Scanner(System.in);
        System.out.print(mensaje + ":");
        //No hace falta poner un string para leer aqui, con poner un return y el teclado vale
        return tec.nextLine();
    }

    public static int leerEntero (String mensaje){
        Scanner tec = new Scanner(System.in);
        System.out.print(mensaje + " :");
        //El integer.ParseInt se escribe para que no de conflicto con los nextLine
        int numeroLeido = Integer.parseInt(tec.nextLine());
        return numeroLeido;
    }

    public static int enteroPositivo (String mensaje){
        Scanner tec = new Scanner(System.in);
        int numeroEntero;
        do {
            System.out.print(mensaje + ":");
            numeroEntero = Integer.parseInt(tec.nextLine());
            if (numeroEntero <= 0){
                System.out.println("Numero incorrecto pon otro");
            }
        }while (numeroEntero <= 0);
        return numeroEntero;
    }


    static void main(String[] args) {
      /*  String nombre = leerCadena("¿Como te llamas?");
        System.out.println("Hola " + nombre);*/


       /* int b = leerEntero("Dime un numero");
        System.out.println("Has dicho este numero " + b);*/

        int numero = enteroPositivo("Dame un numero");
        System.out.println("El numero es: " + numero);

    }
}
