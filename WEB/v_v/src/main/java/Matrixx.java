
public class Matrixx {

    public static void main(String[] args) {
        int i, j;
        System.out.println("MATRIZ NORMAL:");

        int[][] matriz = {{1, 2, 1, 5}, {2, 1, 2, 7}, {3, 6, 3, 1}, {7, 9, 2, 8}, {6, 3, 2, 9}};
        int[][] matrix = new int[matriz[0].length][matriz.length];

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();

        }

        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                matrix[j][i] = matriz[i][j];

            }

        }
        System.out.println("Matris Traspuesta: ");
        for (i = 0; i < matriz[i].length; i++) {
            for (j = 0; j < matriz.length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println("");
        }

    }

}
