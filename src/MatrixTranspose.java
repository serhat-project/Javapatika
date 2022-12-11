public class MatrixTranspose {
    public static void main(String[] args) {
        int i, j;
        int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
        int rows = array1.length;
        int columns = array1[0].length;
        int[][] transpose = new int[columns][rows];

        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                transpose[j][i] = array1[i][j];
            }
        }

        // transpoz matrisi yazdıralım
        System.out.println("Transpoz Matris:");
        for (i = 0; i < columns; i++) {
            for (j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
