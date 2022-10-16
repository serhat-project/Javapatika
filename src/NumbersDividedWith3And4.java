import java.util.Scanner;

public class NumbersDividedWith3And4 {
    public static void main(String[] args) {
        int num, loop = 0, sum =0, turn=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        num = input.nextInt();
        for (int i = 1; i < num ; i++) {
            if ( i % 12 == 0) {
                System.out.println(turn + ". Ortak bölünen sayı:" + i);
                sum += i;
                loop++;
                turn++;

            }
        }
        double avg = sum / loop;
        System.out.println("Girilen sayıya kadar ortak bölünenlerin ortalaması: " + avg);
    }
}


