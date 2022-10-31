import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        //Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.
        System.out.println("Bir sayı girin: ");
        double x;
        int i=0;
        int num= scan.nextInt();

        // ---Solution with For---
//        for (int i = 1; i <=num ; i*=2) {
//            System.out.println(i);

        //---Solution with While---
        boolean flag= true;
        while (flag){
            x = Math.pow(2, i);
            i++;
            if (x<=num){
                System.out.println(x);
            }else {
                flag = false;
            }

        }
    }
}
