import java.util.Scanner;

public class BasamakToplam {
    public static void main(String[] args) {
//        System.out.println("Lütfen bir sayı giriniz: ");
//        int num = new Scanner(System.in).nextInt();
//        int num=154;
//        int result = 0;
//        int basNum = 0;
//        while (num != 0) {
//            result += num%10;
//            num /= 10;
//            basNum++;
//            }
//
//        System.out.println(basNum + " basamaklı sayının basamak değerleri toplamı: " + result);
        int num=654321;

        int toplam=0;
        while (num != 0) {
            toplam=toplam*10;
            toplam += num%10;
            num /= 10;
        }

        System.out.println("sayının tersi: " + toplam);
    }
}

