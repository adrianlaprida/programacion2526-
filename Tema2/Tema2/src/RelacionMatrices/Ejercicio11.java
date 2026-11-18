package RelacionMatrices;

//11. Crea un método que reciba dos matrices, y compruebe si son matrices inversas, es decir,
//si tienen los mismos valores en los índices inversos:
//5 8 9 0 2 3 7 1
//4 7 5 2 y 2 5 7 4
//1 7 3 2 0 9 8 5

public class Ejercicio11 {

    static void main(String[] args) {
        int[][] matriz1 = {{1,2,3} , {4,5,6}};
        int[][] matriz2 = {{6,5,4} , {3,2,1}};
        if (comparacionMatricesInversas(matriz1, matriz2)){
            System.out.println("Son inversas");
        }else {
            System.out.println("No son inversas");
        }
    }

    public static boolean comparacionMatricesInversas(int[][] matriz1, int[][]matriz2){
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                if (matriz1[i][j] != matriz2[matriz2.length-1-i][matriz2[i].length-1-j]){
                    return false;
                }
            }
        }
        return true;
    }
}
