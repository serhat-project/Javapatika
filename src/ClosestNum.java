import java.util.Arrays;

public class ClosestNum {
    public static void main(String[] args) {
        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};
        int aranacakSayi = 5;

        int kucukEnYakinSayi = 0;
        int buyukEnYakinSayi = 0;


        for (int sayi : dizi) {
            if (sayi <= aranacakSayi) {
                // Aranacak sayıdan küçükse yakın sayıyı küçük en yakın sayı değişkenine atıyoruz
                kucukEnYakinSayi = sayi;
            } else {
                // Aranacak sayıdan büyükse yakın sayıyı büyük en yakın sayı değişkenine atıyoruz
                buyukEnYakinSayi = sayi;
                break;
            }
        }

        // Sonuçları ekrana yazdıralım
        System.out.println("Dizi :" + Arrays.toString(dizi));
        System.out.println("Girilen sayı: " + aranacakSayi);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + kucukEnYakinSayi);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + buyukEnYakinSayi);
    }
}