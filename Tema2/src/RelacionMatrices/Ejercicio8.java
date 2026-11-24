package RelacionMatrices;
//Crea un método que reciba dos matrices, que deben ser de igual tamaño, y sume el
//contenido de las posiciones en una tercera matriz, que será la que devuelva:
//| 1 2| + | 4 1| = | 5 3|
//| 4 6| | 1 0| | 5 6|

public class Ejercicio8 {
    static int[][] sumaMatrices;
    static void main(String[] args) {


        int[][] matriz1 = {{2, 2, 2, 2}, {2, 2, 2, 2}};
        int[][] matriz2 = {{2, 2, 2, 2}, {2, 2, 2, 2}};

        boolean comparacion = Ejercicio7.compararTamañoMatriz(matriz1, matriz2);

        if (!comparacion) {
            System.out.println(comparacion);
        } else {
            int[][] resultadoSuma = sumaValoresMatrices(matriz1, matriz2);
            System.out.println("El resultado de la suma es: ");

            for (int i = 0; i <sumaMatrices.length; i++) {
                for (int j = 0; j < sumaMatrices[i].length; j++) {
                    System.out.print(sumaMatrices[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static int[][] sumaValoresMatrices(int[][] matriz1, int[][] matriz2) {
        //Esto es para crear una matriz que no se sabe si es cuadrada
       sumaMatrices = new int[matriz1.length][];

       for (int i = 0; i < matriz1.length; i++) {
           sumaMatrices[i] = new int[matriz1[i].length];
       }

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                sumaMatrices[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return sumaMatrices;
    }
}




