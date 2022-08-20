import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        double armut=2.14, elma=3.67, domat=1.11, muz=0.95, pat=5.00;
        int armkg, elmkg, domkg, muzkg, patkg;
        System.out.print("Armut Kaç kilo: ");
        armkg = girdi.nextInt();

        System.out.print("Elma Kaç kilo: ");
        elmkg = girdi.nextInt();

        System.out.print("Domates Kaç kilo: ");
        domkg = girdi.nextInt();

        System.out.print("Muz Kaç kilo: ");
        muzkg = girdi.nextInt();

        System.out.print("Patlıcan Kaç kilo: ");
        patkg = girdi.nextInt();

        System.out.println("Ödemeniz gereken tutar: " + ((armkg*armut) + (elmkg*elma) + (domkg*domat) + (muzkg*muz) + (patkg*pat)) + " TL'dir");


    }
}