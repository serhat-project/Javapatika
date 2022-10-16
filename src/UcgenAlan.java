import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        int a, b, c, u;
        double alan;

        System.out.println("Lütfen a kenarı için değer giriniz: ");
        a = girdi.nextInt();

        System.out.println("Lütfen b kenarı için değer giriniz: ");
        b = girdi.nextInt();

        System.out.println("Lütfen c kenarı için değer giriniz: ");
        c = girdi.nextInt();

        u = (a + b + c) / 2;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin alanı: " + alan);


    }
}
