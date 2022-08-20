import java.util.Scanner;

public class BodyIndex {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        double kilo, boy, index;

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = girdi.nextDouble();

        System.out.print("Lütfen boyunuzu metre olarak giriniz: ");
        boy = girdi.nextDouble();

        index = kilo / (boy * boy);

        System.out.println("Vücut kitle indeksiniz: " + index);
        System.out.println(index > 30 ? "Obez kategorisindesiniz!" : "Sağlıklı kalmaya devam edin!");

    }
}
