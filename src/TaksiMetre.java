import java.util.Scanner;

public class TaksiMetre {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        int yol, acilis=10;
        double kmDeger = 2.20, ucret;

        System.out.println("Lütfen gidilen yolu Km olarak giriniz: ");
        yol = girdi.nextInt();

        ucret = (yol * kmDeger) + acilis;

        System.out.println("Ödenecek Tutar :" + (ucret > 20 ? ucret : 20) + " Türk lirasıdır.");

    }
}
