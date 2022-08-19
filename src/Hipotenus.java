import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b;
        double x, c;

        System.out.println("Lütfen a kenarı için değer giriniz: ");
        a = input.nextInt();

        System.out.println("Lütfen b kenarı için değer giriniz: ");
        b = input.nextInt();

        x = (a*a) + (b*b);
        c = Math.sqrt(x);
        System.out.println("Bu üçgenin hipotenüsü: " + c );



    }
}
