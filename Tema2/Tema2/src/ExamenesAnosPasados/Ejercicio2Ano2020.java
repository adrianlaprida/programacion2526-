package ExamenesAnosPasados;

public class Ejercicio2Ano2020 {
    static void main(String[] args) {
        int[][] jardin = {
                {1, 0, 0, 0, 1, 0, 0, 0, 2, 1, 1, 0, 0, 5, 0},
                {0, 2, 0, 5, 0, 0, 3, 0, 1, 0, 0, 0, 1, 0, 0},
                {3, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 2, 4},
                {0, 0, 2, 0, 0, 0, 0, 0, 2, 1, 3, 0, 0, 0, 1},
                {0, 0, 1, 0, 0, 0, 3, 0, 1, 0, 0, 0, 0, 0, 3},
                {4, 3, 0, 0, 0, 2, 1, 0, 0, 0, 0, 5, 0, 0, 0},
                {1, 2, 0, 5, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 2},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1},
                {3, 0, 0, 0, 0, 0, 2, 1, 4, 0, 0, 0, 1, 0, 0},
                {2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 3, 0},
                {0, 0, 5, 1, 0, 0, 0, 5, 0, 3, 0, 0, 1, 0, 0},
                {1, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 5, 2, 4, 0},
                {0, 0, 1, 3, 0, 0, 1, 0, 0, 1, 0, 0, 1, 3, 0},
                {0, 1, 2, 1, 0, 0, 0, 0, 0, 2, 3, 1, 0, 0, 1},
                {1, 3, 4, 0, 0, 5, 0, 0, 1, 0, 0, 0, 0, 4, 2}
        };

    }


    public static void metodoJardin(int [][] jardin){
        for (int i = 0; i < jardin.length; i++) {
            for (int j = 0; j < jardin[i].length; j++) {

                boolean florece = hayAgua(jardin, i, j);

            }
        }
    }

    public static boolean hayAgua(int[][] jardin, int i, int j){
        for (int k = i - 1; k < i + 1; k++) {
            for (int l = j -1; l < j + 1; l++) {
                //Esta asi para guardarlo
                if (k == j);
            }
        }
        return false;
    }
}
