import java.util.Scanner;

public class PowerOfNumbers {
    public static void main(String[] args) {
        //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı yazıyoruz.
        Scanner scan = new Scanner(System.in);
        System.out.println("Üssü alınacak sayı: ");
        int n= scan.nextInt();
        System.out.println("Üs olacak sayı: ");
        int r= scan.nextInt();
        int total=1;

        for (int i = 0; i < r ; i++) {
            total*=n;

        }

        System.out.println("Sonucunuz: " + total);
    }
}
