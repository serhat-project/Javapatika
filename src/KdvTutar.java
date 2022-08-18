import java.util.Scanner;


public class KdvTutar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double urunFiyati, kdvTutar, toplam;

        System.out.print("KDV'siz ürün fiyatı giriniz: ");
        urunFiyati = input.nextDouble();

        double kdvOran = (urunFiyati < 1000) ? 0.18 : 0.08;

        kdvTutar = urunFiyati * kdvOran;
        System.out.println("KDV tutarı : " + kdvTutar);

        toplam = urunFiyati + kdvTutar;
        System.out.println("KDV'li Toplam fiyat: " + toplam);
    }
}
