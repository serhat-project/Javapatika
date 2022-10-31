import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        //Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.
        System.out.println("Bir sayı girin: ");
        int num= scan.nextInt();
        for (int i = 0; i <=num ; i++) {
            System.out.println("2 üzeri " + i + " = " + Math.pow(2, i) );

        }
    }
}
