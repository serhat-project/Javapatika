import java.util.Random;

public class MineSweeper {

    // Oyunda kullanacağımız dizileri tanımlıyoruz.
    private char[][] gameBoard;
    private char[][] mines;

    // Satır ve sütun sayısını alan kurucu metod.
    public MineSweeper(int row, int col) {
        gameBoard = new char[row][col];
        mines = new char[row][col];
    }

    // Oyun tahtasını oluşturan metod.
    public void buildGameBoard(){
        // Oyun tahtasının her noktasına "." atıyoruz.
        for(int i = 0 ; i < gameBoard.length ; i++) {
            for(int j = 0 ; j < gameBoard[0].length ; j++) {
                gameBoard[i][j] = '.';
            }
        }
    }

    // Mayınları oluşturan metod.
    public void layMines() {
        // Mayınları oluşturmak için random sınıfından nesne üretiyoruz.
        Random random = new Random();
        // Mayınların sayısını hesaplıyoruz.
        int mineCount = (gameBoard.length * gameBoard[0].length) / 4;

        // Mayınları rastgele yerleştiriyoruz.
        int mineRow, mineCol;
        for(int i = 0 ; i < mineCount ; i++) {
            mineRow = random.nextInt(gameBoard.length);
            mineCol = random.nextInt(gameBoard[0].length);
            // Mayınların olmadığı konumlar seçiliyor.
            if(mines[mineRow][mineCol] != 'X') {
                mines[mineRow][mineCol] = 'X';
            } else {
                // Eğer mayınların olduğu konumlar seçilirse mayın sayısı azalıyor.
                mineCount++;
            }
        }
    }

    // Nokta seçme metodu.
    public void choose(int row, int col) {
        // Seçilen noktanın sınırlar dışına çıkmaması için kontrol ediyoruz.
        if(row < 0 || row >= gameBoard.length || col < 0 || col >= gameBoard[0].length) {
            System.out.println("Sınırlar dışında bir nokta seçtiniz. Tekrar deneyiniz.");
        } else {
            // Seçilen noktada mayın var ise kaybetme mesajı veriyoruz.
            if(mines[row][col] == 'X') {
                System.out.println("Mayına bastınız. Oyunu kaybettiniz.");
            } else {
                // Mayın yok ise etrafındaki mayın sayısını bulup noktaya yazıyoruz.
                int count = getAdjacentMines(row, col);
                gameBoard[row][col] = Character.forDigit(count, 10);
            }
        }
    }

    // Etraftaki mayın sayısını bulan metod.
    public int getAdjacentMines(int row, int col) {
        int count = 0;
        // Etraftaki bütün konumları kontrol ediyoruz.
        for(int i = row-1 ; i <= row+1 ; i++) {
            for(int j = col-1 ; j <= col+1 ; j++) {
                // Dizinin sınırlarını aşmaması için kontrol ediyoruz.
                if(i >= 0 && i < mines.length && j >= 0 && j < mines[0].length) {
                    // Etraftaki mayınları sayıyoruz.
                    if(mines[i][j] == 'X') {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    // Oyunu kazanma durumunu kontrol eden metod.
    public boolean isGameWon() {
        // Oyun tahtasının tüm noktalarını kontrol ediyoruz.
        for(int i = 0 ; i < gameBoard.length ; i++) {
            for(int j = 0 ; j < gameBoard[0].length ; j++) {
                // Eğer bir noktaya mayın konulmamış ama kullanıcı tarafından seçilmemişse false döndürüyoruz.
                if(gameBoard[i][j] == '.') {
                    return false;
                }
            }
        }
        // Eğer tüm noktalar seçilmişse true döndürüyoruz.
        return true;
    }

    // Oyun tahtasını ekrana yazdıran metod.
    public void printGameBoard() {
        // Oyun tahtasının tüm noktalarını ekrana yazdırıyoruz.
        for(int i = 0 ; i < gameBoard.length ; i++) {
            for(int j = 0 ; j < gameBoard[0].length ; j++) {
                System.out.print(gameBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
}
