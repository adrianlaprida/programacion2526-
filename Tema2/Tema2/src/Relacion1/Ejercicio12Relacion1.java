package Relacion1;


//Crea un método que acepte un array de enteros y devuelva el mismo array ordenado
//de menor a mayor. Utiliza para ello el método de ordenación de la burbuja.


public class Ejercicio12Relacion1 {
    static void main(String[] args) {
        int[] array1= {5,1,2,3,6,4};
        int[] resultado = burbuja(array1);
        System.out.println(resultado);
    }

    public static int[] burbuja(int[] array1){
        int t = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i+1]< i) {
                t = array1[i+1];
                array1[i+1] = array1[i];
                array1[i] = t;

            }
        }
        return array1;
    }
}
