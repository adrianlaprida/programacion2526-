package Relacion1;


//Crea un método que acepte un array de enteros y devuelva el mismo array ordenado
//de menor a mayor. Utiliza para ello el método de ordenación de la burbuja.


public class Ejercicio12Relacion1 {
    static void main(String[] args) {
        int[] array1= {5,1,2,3,6,4};
        burbuja(array1);
        /*int[] resultado = burbuja(array1);*/

        //Si ponemos sout(Arrays.toString(array1)) se coloca como un array
        for (int i = 0; i <array1.length; i++) {
            System.out.println(array1[i]);
        }
    }
    //Si creo una array y en un metodod acepto una array, como estan apuntando a la misma direccion de memoria no hace falta que devuelva nada ya que esta modificando el original.
    public static void burbuja(int[] array1) {
        int t = 0;
        for (int j = 0; j < array1.length; j++) {
            for (int i = 0; i < array1.length - 1 - j; i++) {
                if (array1[i] > array1[i + 1]) {
                    t = array1[i];
                    array1[i] = array1[i + 1];
                    array1[i + 1] = t;

                }
            }
        }

    }
}
