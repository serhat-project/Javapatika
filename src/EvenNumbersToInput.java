import java.util.Scanner;

public class EvenNumbersToInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");

        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.print(i);

            }
        }
    }
}
