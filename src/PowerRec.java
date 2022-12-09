import java.util.Scanner;

public class PowerRec {
        public static int power(int base, int exp)
        {
            // Üssü 0 ise taban değerini geri döndürür
            if (exp == 0)
                return 1;
            else
                // üssü 1 ise taban değerini geri döndürür
                if (exp == 1)
                    return base;
                else
                    // üsü 1'den büyükse üssünü recursive olarak işleme sokar
                    return base * power(base, exp - 1);
        }

        public static void main(String[] args)
        {
            int base, exp;
            Scanner sc = new Scanner(System.in);
            System.out.println("Taban değerini giriniz: ");
            base = sc.nextInt();
            System.out.println("Üs değerini giriniz: ");
            exp = sc.nextInt();

            System.out.println("Sonuç: "+power(base, exp));
        }
    }

