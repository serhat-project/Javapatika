import java.util.Scanner;

public class Powersof4and5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
        System.out.println("Bir sayı giriniz: ");
        int num = scan.nextInt();
        double x;
        double y;
        int i=0;
        boolean flag= true;
        while (flag){
            x = Math.pow(4, i);
            y= Math.pow(5, i);
            if ((x<=num) | (y<=num)){
                System.out.println(num +" 'a kadar 4 ve 5'ün kuvvetleri: " + x);
                System.out.println(num +" 'a kadar 4 ve 5'ün kuvvetleri: " + y);
            }else {
                flag = false;
            }
            i++;
        }
    }
}