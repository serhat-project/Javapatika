import java.util.Scanner;

public class MinMaxValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            System.out.print((i + 1) + ". Sayıyı giriniz: ");
            int sayi = scanner.nextInt();
            if(sayi < min){
                min = sayi;
            }
            if(sayi > max){
                max = sayi;
            }
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
