import java.util.Scanner;

public class totalOddNumbers {
    public static void main(String[] args) {
//        Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
//        çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
        Scanner scan = new Scanner(System.in);
        int num;
        int total =0;
        do {
            System.out.println("Bir sayı girin: ");
            num= scan.nextInt();
            if (num%4==0){
                total+=num;
            }
        }while(num%2==0);
        System.out.println("Toplam: " +total);

    }
}
