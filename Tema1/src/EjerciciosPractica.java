import java.util.Scanner;



public class EjerciciosPractica {
    static void main(String[] args) {
        Scanner tec = new Scanner(System.in);


        System.out.println("Introduce una cadena de numeros");
        int num= tec.nextInt();
        int numInverso = 0;

        while (num > 0){
            int ultimoDigito = num%10;
            numInverso = (numInverso*10) + ultimoDigito;
            num = num/10;
        }

        System.out.println("El numero a la inversa es " + numInverso);
    }
}
