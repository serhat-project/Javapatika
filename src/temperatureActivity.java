import java.util.Scanner;


public class temperatureActivity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sıcaklık değerini giriniz: ");
        double heat= input.nextDouble();

        String activity = heat <= 5 ? "Kayak yapınız": heat > 5 && heat <= 15 ? "Sinemaya gidiniz":
                heat > 15 && heat <= 25? "Pikniğe gidiniz": "Yüzmeye gidiniz";

        System.out.println(activity);




    }
}
