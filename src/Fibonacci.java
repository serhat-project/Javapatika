import java.util.Scanner;

class Fibonacci {

    public static void main(String args[]) {

        int elemanSayi, ilkSayi = 0, ikinciSayi = 1;
        Scanner giris = new Scanner(System.in);

        System.out.print("Fibonacci serisine kaç eleman girilsin: ");
        elemanSayi = giris.nextInt();
        System.out.print("Fibonacci serisi: " + ilkSayi + " " + ikinciSayi);

        int sonSayi;
        for (int i = 2; i < elemanSayi; ++i) {
            sonSayi = ilkSayi + ikinciSayi;
            System.out.print(" " + sonSayi);
            ilkSayi = ikinciSayi;
            ikinciSayi = sonSayi;
        }
    }
}