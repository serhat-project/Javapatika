import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        int r;
        double pi = 3.14, a;

        System.out.print("Lütfen dairenin yarıçapını giriniz: ");
        r = girdi.nextInt();

        System.out.println("Dairenin alanı: " + (pi * r * r));
        System.out.println("Dairenin çevresi: " + (2 * pi * r));

        System.out.println("Lütfen merkez açı ölçüsüsü giriniz: ");
        a = girdi.nextDouble();

        System.out.println("Daire diliminin alanı: "+ pi * (r*r) * a / 360);

    }
}

