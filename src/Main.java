import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notlarınız: ");
        mat = input.nextInt();

        System.out.println("Fizik Notlarınız: ");
        fizik = input.nextInt();

        System.out.println("Kimya Notlarınız: ");
        kimya = input.nextInt();

        System.out.println("Türkçe Notlarınız: ");
        turkce = input.nextInt();

        System.out.println("Muzik Notlarınız: ");
        muzik = input.nextInt();

        int toplam = (mat + fizik + kimya + turkce + muzik);
        double sonuc = toplam / 5;
        System.out.println("Ortalamanız : " + sonuc);

        String dersSonucu = (sonuc > 60) ? "GECTİNİZ": "BASARISIZ";
        System.out.println(dersSonucu);

    }
}
