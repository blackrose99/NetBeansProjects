

public class sev {

    public static void main(String[] args) {

    

        int[][] matriz = {{5, 5, 1}, {4, 4, 4}, {5, 6, 8}, {4, 5, 6}};

        int[][] matrizT = new int[matriz[0].length][matriz.length];

        int x, y;

        for (x = 0; x < 4; x++) {

            for (y = 0; y < 3; y++) {

                System.out.print(matriz[x][y] + "\t");

            }

            System.out.println("");

        }

        System.out.println("");

        for (x = 0; x < matriz.length; x++) {

            for (y = 0; y < matriz[x].length; y++) {

                matrizT[y][x] = matriz[x][y];

            }

        }

        System.out.println("Matriz Traspuesta" + "\n");

        for (x = 0; x < matriz[x].length; x++) {

            for (y = 0; y < matriz.length; y++) {

                System.out.print(matrizT[x][y] + "\t");

            }

            System.out.println();

        }

    }

}
