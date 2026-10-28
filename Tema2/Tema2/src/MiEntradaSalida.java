import java.util.Locale;
import java.util.Scanner;

public class MiEntradaSalida {
    static Scanner tec = new Scanner(System.in);

    public static String leerCadena(String mensaje) {
        System.out.print(mensaje + ":");
        //No hace falta poner un string para leer aqui, con poner un return y el teclado vale
        return tec.nextLine();
    }

    public static int leerEntero(String mensaje) {
        System.out.print(mensaje + " :");
        //El integer.ParseInt se escribe para que no de conflicto con los nextLine
        int numeroLeido = Integer.parseInt(tec.nextLine());
        return numeroLeido;
    }

    public static int enteroPositivo(String mensaje) {
        int numeroEntero;
        do {
            System.out.print(mensaje + ":");
            numeroEntero = Integer.parseInt(tec.nextLine());
            if (numeroEntero <= 0) {
                System.out.println("Numero incorrecto pon otro");
            }
        } while (numeroEntero <= 0);
        return numeroEntero;
    }

    public static double leerDouble(String mensaje) {
        double numeroDecimal;
        System.out.print(mensaje + ":");
        numeroDecimal = Double.parseDouble(tec.nextLine());
        return numeroDecimal;
    }

    public static int leerEnteroEnRango(String mensaje, int numeroMinimo, int numeroMaximo) {
        int numeroIntroducido;

        System.out.print(mensaje);

        do {
            numeroIntroducido = Integer.parseInt(tec.nextLine());
            if (numeroIntroducido < numeroMinimo || numeroIntroducido > numeroMaximo) {
                System.out.println("El numero introducido no es correcto, intoduce uno mayor que 5 y menor que 100");
            }
        } while (numeroIntroducido < numeroMinimo || numeroIntroducido > numeroMaximo);
        return numeroIntroducido;
    }

    public static char leerChar(String mensaje){
        System.out.println(mensaje + ":");
        char letraIntroducida = tec.nextLine().charAt(0);
        return letraIntroducida;
    }

    public static char continuarSINO(String mensaje){
        System.out.println(mensaje);
        char contianuarSINO;
        do {
            contianuarSINO = tec.nextLine().toUpperCase().charAt(0);
            if (contianuarSINO != 's' || contianuarSINO != 'n'){
                System.out.println("La letra no es valida , las opciones posibles son para si(s) o no(n)");
            }
        }while (contianuarSINO == 's');
        return contianuarSINO
    }


    static void main(String[] args) {
      /*  String nombre = leerCadena("¿Como te llamas?");
        System.out.println("Hola " + nombre);*/


       /* int b = leerEntero("Dime un numero");
        System.out.println("Has dicho este numero " + b);*/

        /*int numero = enteroPositivo("Dame un numero");
        System.out.println("El numero es: " + numero);*/

        /*double numero = leerDouble("Dame un numero decimal");
        System.out.println("El numero decimal es " + numero);*/


        //Se pueden usar otros metodos dentro de la llamada al metodo que quieras usar.
        /*int numero = leerEnteroEnRango("Introduce tu edad:", enteroPositivo("Dame un numero minimo"), enteroPositivo("Dame un numero maximo"));
        System.out.println("Has introducido el numero " + numero);*/


        /*char caracter = leerChar("Dime un caracter");
        System.out.println("El caracter introducido es " + caracter);*/



    }
}
