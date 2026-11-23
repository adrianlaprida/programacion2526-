package RelacionMatrices;

//Crea un método que compruebe, sobre una matriz de enteros, cuántas casillas
//adyacentes tienen valores pares. Se considera adyacente todas las posiciones
//colindantes, incluidas las diagonales. En el siguiente ejemplo, el 7 (en rojo) tiene 4
//casillas colindantes con números pares. El resultado se deberá guardar en otra matriz,
//que contendrá dichos números. Para este ejercicio, consideraremos que el 0 es par.
//1 2 3 4 5 1 2 3 2 2
//6 7 8 9 0 2 4 4 4 2
//3 2 1 4 5 → 2 3 5 4 3
//9 5 8 6 7 2 4 4 4 3
//0 9 8 5 4 0 3 2 4 1

public class Ejercicio16 {
        static void main(String[] args) {
            int[][] matriz = {{1,2,3,4,5},{6,7,8,9,0},{3,2,1,4,5},{9,5,8,6,7},{0,9,8,5,4}};

            int[][] matrizContador = contarPares(matriz);

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("________________");

            for (int i = 0; i < matrizContador.length; i++) {
                for (int j = 0; j < matrizContador[i].length; j++) {
                    System.out.print(matrizContador[i][j] + " ");
                }
                System.out.println();
            }

        }


    /**
     * Recorrer las casillas y contar los numeros que son pares
     * @param matriz
     * @return
     */
    public static int[][] contarPares(int[][] matriz) {
        int[][] matrizContador = new int[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int contador = 0;

                for (int k = i - 1; k <= i + 1; k++) {
                    for (int l = j - 1; l <= j + 1; l++) {
                        // Saltar la propia celda
                        if (k == i && l == j) {
                            continue;
                        }
                        // Saltar posiciones fuera de la matriz
                        if (k < 0 || k >= matriz.length || l < 0 || l >= matriz[k].length) {
                            continue;
                        }
                        if (matriz[k][l] % 2 == 0) {
                            contador++;
                        }
                    }
                }

                matrizContador[i][j] = contador;
            }
        }

        return matrizContador;
    }
}
