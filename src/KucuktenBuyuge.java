import java.util.Scanner;

public class KucuktenBuyuge {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int a,b,c;

        System.out.print("Lütfen a sayısını girin: ");
        a = girdi.nextInt();
        System.out.print("Lütfen b sayısını girin: ");
        b=girdi.nextInt();
        System.out.print("lütfen c sayısını girin: ");
        c=girdi.nextInt();

        if ((a<b) && (a<c)) {
            if (b < c) {
                System.out.println("a<b<c");
            } else {
                System.out.println("a<c<b");

            }
        }else if ((b<a) && (b<c)) {
            if (a<c) {
                System.out.println("b<a<c");
            }else {
                System.out.println("b<c<a");
            }

        }else if ((c<a) && (c<b)) {
            if (a<b) {
                System.out.println("c<a<b");
            }else {
                System.out.println("c<b<a");
            }
        }

    }
}
