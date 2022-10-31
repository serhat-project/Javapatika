import java.util.Scanner;

public class totalEvenNum {
    public static void main(String[] args) {
//        Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve
//        girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.
        Scanner scan = new Scanner(System.in);
        int num;
        int total =0;
        do {
            System.out.println("Bir sayı giriniz: ");
            num= scan.nextInt();
            if (num%2==1){
                total+=num;
            }
        }while(num>0);
        System.out.println("Toplam: " +total);


        }
    }

