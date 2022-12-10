public class LetterBWithStars {
    public static void main(String[] args) {
        String[][] shape = new String[7][4];

        for (int i = 0; i < shape.length; i++) {
            for (int j = 0; j < shape[i].length; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    shape[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    shape[i][j] = " * ";
                } else {
                    shape[i][j] = "   ";
                }
            }
        }

        for (String[] row : shape){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
