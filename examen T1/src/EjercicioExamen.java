import java.util.Scanner;

public class EjercicioExamen {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Dime tu nombre");
        String nombrePiloto = tec.nextLine();
        Integer.parseInt(nombrePiloto);

        int vueltas;
        double tiempoObjetivo;
        double tiempoEmpleado;
        double tiempoTotal = 0;

        tiempoEmpleado = Integer.MIN_VALUE;

        do {
            System.out.println("Cuantas vueltas vas a dar");
            vueltas = Integer.parseInt(tec.nextLine());
            if (vueltas < 3 || vueltas > 10){
                System.out.println("Introcede un numero valido (3-10)");
            }
        }while (vueltas < 3 || vueltas > 10);

        do {
            System.out.println("Cual es tu tiempo objetivo");
            tiempoObjetivo = Double.parseDouble(tec.nextLine());
            if (tiempoObjetivo < 0){
                System.out.println("Introduce un numero que sea mayo a cero");
            }
        }while (tiempoObjetivo < 0);

        do {
            System.out.println("Cuanto tiempo has tardado");
            tiempoEmpleado = Double.parseDouble(tec.nextLine());
            if (tiempoEmpleado > tiempoObjetivo){
                System.out.println("Por encima del objetivo");
            } else if (tiempoEmpleado == tiempoObjetivo) {
                System.out.println("Objetivo igualado");
            }else System.out.println("Objetivo mejorado");

            for (int i = 2; i < vueltas; i++){
                System.out.println("Vuelta " + i + " :");
                tiempoEmpleado = Double.parseDouble(tec.nextLine());
                if (tiempoEmpleado > tiempoObjetivo){
                    System.out.println("Por encima del objetivo");
                } else if (tiempoEmpleado == tiempoObjetivo) {
                    System.out.println("Objetivo igualado");
                }else System.out.println("Objetivo mejorado");
            }

        }while (tiempoEmpleado < 0);

        System.out.println("Tu nombre es " + nombrePiloto);
        for (int j = 0; j <= vueltas; j++ ){
             tiempoTotal = tiempoEmpleado ;
        }
        System.out.println("Tiempo total : " + tiempoTotal);


        System.out.println(tiempoEmpleado);
    }
}
