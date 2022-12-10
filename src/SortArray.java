
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dizinin boyutunu rakamla yazınız: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Dizinin elemanlarını giriniz :");
        for(int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". elemanı : ");
            array[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.print("Sıralama : ");
        for(int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
