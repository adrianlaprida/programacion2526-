import java.util.Scanner;

//Realizar un programa que lea dos números enteros cualesquiera numeroA
//y numeroB, y calcule el producto los números mediante sumas, es decir,
//sin usar el operador *.

public class Ejercicio13 {
    static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        System.out.println("Dame un numero A");
        int a = tec.nextInt();
        System.out.println("Dame un numero B");
        int b = tec.nextInt();

        int resultado = 0;

        for (int i = 0; i<b; i++ ){
            resultado = resultado + a;
        }
        System.out.println("El resultado es " + resultado);
    }
}
