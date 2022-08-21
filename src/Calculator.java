import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        int n1, n2, secim;

        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı yazınız: ");
        n1 = input.nextInt();

        System.out.print("İkinci sayıyı yazınız: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("İşleminizi Seçiniz: ");
        secim = input.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Sonuç: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Sonuç: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Sonuç: " + (n1 * n2));
                break;
            case 4:
                switch (n2) {
                    case 0:
                        System.out.println("Bir sayı sıfıra bölümenez");
                        break;
                    default:
                        System.out.println("Sonuç: "+ (n1 / n2));
                }
                break;

            default:
                System.out.println("Hatalı işlem seçimi");
        }





    }
}