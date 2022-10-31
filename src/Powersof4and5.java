import java.util.Scanner;

public class Powersof4and5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
        System.out.println("Bir sayı giriniz: ");
        int num = scan.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println("4 üzeri " + i + " = " + Math.pow(4, i));
            System.out.println("5 üzeri " + i + " = " + Math.pow(5, i));
            System.out.println(" ");
        }
    }
}