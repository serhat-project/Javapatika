import java.util.Scanner;

public class NumberGuessGame

{
    public static void main(String[] args)

    {
        int secretNumber = (int) (Math.random() * 101);
        Scanner scanner = new Scanner(System.in);
        int guessCount = 0;
        boolean outOfGuesses = false;

        System.out.println("Sayıyı tahmin etme oyununa hoşgeldiniz!");
        System.out.println("Sayı 0 ile 100 arasında bir değerdir");
        System.out.println("5 tahminde sayıyı tahmin etmeye çalışın!");


        int guess=0;
        while (secretNumber != guess && !outOfGuesses) {
            if (guessCount < 5) {
                System.out.print("Tahmininizi girin: ");
                guess = scanner.nextInt();
                guessCount++;
                if (guess < secretNumber) {
                    System.out.println("Daha yüksek bir sayı girin.");
                } else if (guess > secretNumber) {
                    System.out.println("Daha düşük bir sayı girin.");
                }
            } else {
                outOfGuesses = true;
            }
        }
        if (outOfGuesses) {
            System.out.println("Tahmin hakkınızı bitti. Doğru sayı: " + secretNumber);
        } else {
            System.out.println("Tebrikler! Sayıyı " + guessCount + " tahminde buldunuz.");
        }
    }

}