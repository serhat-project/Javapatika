import java.util.Scanner;

public class DersGecme {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        double toplam = 0, ders = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notu: ");
        mat= input.nextInt();
        if (mat<0 || mat >100)
        {
            System.out.println("Matematik notunuz yanlış girilmiştir ve ortalamaya dahil edilmeyecektir.");
        }
        else {
            toplam = toplam + mat;
            ders += 1;
        }


        System.out.print("Fizik notu: ");
        fizik= input.nextInt();
        if (fizik<0 || fizik >100)
        {
            System.out.println("Fizik notunuz yanlış girilmiştir ve ortalamaya dahil edilmeyecektir.");
        }
        else {
            toplam = toplam + fizik;
            ders += 1;
        }

        System.out.print("Türkçe notu: ");
        turkce= input.nextInt();
        if (turkce<0 || turkce >100)
        {
            System.out.println("Türkçe notunuz yanlış girilmiştir ve ortalamaya dahil edilmeyecektir.");
        }
        else {
            toplam = toplam + turkce;
            ders += 1;
        }

        System.out.print("Kimya notu: ");
        kimya= input.nextInt();
        if (kimya<0 || kimya >100)
        {
            System.out.println("Kimya notunuz yanlış girilmiştir ve ortalamaya dahil edilmeyecektir.");
        }
        else {
            toplam = toplam + kimya;
            ders += 1;
        }

        System.out.print("Müzik notu: ");
        muzik= input.nextInt();
        if (muzik<0 || muzik >100)
        {
            System.out.println("Müzik notunuz yanlış girilmiştir ve ortalamaya dahil edilmeyecektir.");
        }
        else {
            toplam = toplam + muzik;
            ders += 1;
        }

        double average = toplam / ders;

        if (average <= 50 ) {
            System.out.println("Sınıfta kaldınız");

        }
        else {
            System.out.println("Tebrikler, geçtiniz!");
        }
        System.out.println("Ortalamanız :" + average);
    }
}
