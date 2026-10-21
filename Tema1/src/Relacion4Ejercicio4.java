import java.util.Scanner;

//Realiza un programa que pregunte al usuario la hora actual (hora, minutos y
//segundos), y luego pregunte otra hora que deberá sumar a la primera, teniendo en
//cuenta el cambio de día.
//Los siguientes son salidas esperadas para las entradas:
//Introduce la hora base: 13
//Introduce los minutos base: 27
//Introduce los segundos base: 10
//¿Cuántas horas quieres sumar?: 1
//¿Cuántos minutos quieres sumar?: 0
//¿Cuántos segundos quieres sumar?: 55
//La hora resultante es: 14:28:05
//Introduce la hora base: 19
//Introduce los minutos base: 0
//Introduce los segundos base: 0
//¿Cuántas horas quieres sumar?: 5
//¿Cuántos minutos quieres sumar?: 0
//¿Cuántos segundos quieres sumar?: 0
//La hora resultante es: 00:00:00 (del día siguiente)

public class Relacion4Ejercicio4 {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Dame la hora");
        int hora = tec.nextInt();
        System.out.println("Dame los minutos");
        int minutos = tec.nextInt();
        System.out.println("Dame los segundos");
        int segundos = tec.nextInt();

        System.out.println("Inventate una hora para sumarla a la anterior");
        int hora2 = tec.nextInt();
        System.out.println("Inventate los minutos para sumarlos a los anteriores");
        int minutos2 = tec.nextInt();
        System.out.println("Inventate los segundos para sumarselo a los anteriores");
        int segundos2 = tec.nextInt();

        int segundosFinal = (segundos+segundos2) % 60;
        int sumaSegundosFinal = (segundos+segundos2) / 60;

        int minutosfinal = (minutos+minutos2+sumaSegundosFinal) % 60;
        int sumaMinutosFinal = (minutos+minutos2+sumaSegundosFinal) / 60;

        int horaFinal = (hora+hora2+sumaMinutosFinal) % 24;
        int sumaHoraFinal = (hora+hora2+sumaMinutosFinal) / 24;

        System.out.println("La hora es " + horaFinal + " :" + minutosfinal + " :" + segundosFinal + " + " + sumaHoraFinal + " dias despues");

    }
}
