package ExamenesAnosPasados;

public class EjercicioExamenArrays2020 {
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

        for (int i = 0; i < jardin.length; i++) {
            for (int j = 0; j < jardin[i].length; j++) {

                boolean florece = false;
                boolean agua = hayAgua(jardin, i, j);
                boolean abeja = hayAbeja(jardin, i, j);
                boolean hierba = hayMalasHierbas(jardin, i, j);
                boolean gusano = hayGusano(jardin, i, j);

                if (jardin[i][j] != 1){
                    continue;
                }

                if (agua && abeja && (!hierba || gusano)){
                    florece = true;
                }

                if (florece){
                    System.out.printf("La flor de la posicion %d,%d florece%n", i, j);
                }
            }
        }
    }

    public static boolean hayAgua(int[][] jardin, int i, int j) {
        boolean hayAgua = false;
        for (int k = i - 1; k <= i + 1; k++) {
            for (int l = j - 1; l <= j + 1; l++) {
                if (k >= 0 && k < jardin.length && l >= 0 && l < jardin[0].length) {
                    if (jardin[k][l] == 2) {
                        hayAgua = true;
                    }
                }
            }
        }
        return hayAgua;
    }


    public static boolean hayAbeja(int[][] jardin, int i, int j) {
        boolean hayAbeja = false;
        for (int k = i - 3; k <= i + 3; k++) {
            for (int l = j - 3; l <= j + 3; l++) {
                if (k >= 0 && k < jardin.length && l >= 0 && l < jardin[0].length) {
                    if (jardin[k][l] == 5) {
                        hayAbeja = true;
                    }
                }
            }
        }
        return hayAbeja;
    }


    public static boolean hayMalasHierbas(int[][] jardin, int i, int j) {
       boolean hayMalaHierba = false;
        for (int k = i - 1; k <= i + 1; k++) {
            for (int l = j - 1; l <= j + 1; l++) {
                if (k >= 0 && k < jardin.length && l >= 0 && l < jardin[0].length) {
                    if (jardin[k][l] == 3) {
                        hayMalaHierba = true;
                    }
                }
            }
        }
        return hayMalaHierba;
    }


    public static boolean hayGusano(int[][] jardin, int i, int j) {
        boolean hayGusano = false;
        for (int k = i - 1; k <= i + 1; k++) {
            for (int l = j - 1; l <= j + 1; l++) {
                if (k >= 0 && k < jardin.length && l >= 0 && l < jardin[0].length) {
                    if (jardin[k][l] == 4) {
                        hayGusano = true;
                    }
                }
            }
        }
        return hayGusano;
    }
}


