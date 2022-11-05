import java.util.Scanner;

public class totalEvenNum {
    public static void main(String[] args) {
//        Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve
//        girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.
//
//        Scanner scan = new Scanner(System.in);

//        int num;
//        int total =0;
//        do {
//            System.out.println("Bir sayı giriniz: ");
//            num= scan.nextInt();
//            if (num%2==1){
//                total+=num;
//            }
//        }while(num>0);
//        System.out.println("Toplam: " +total);

        Scanner input = new Scanner(System.in);
        int sum = 0;
        int num = 0;

        for (int i = 0; i >= 0; i++) {
            System.out.println("Please enter a positive number. Or enter a negative number to exit the program: ");
            num = input.nextInt();

            if (num < 0) {
                System.out.println("Negatif sayı girdiniz.");
                break;
            }

            if (num % 2 == 1) {
                sum += num;
            }
        }
        System.out.println("Sum of the even numbers you entered = " + sum);

    }
}

//        Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
//        4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
