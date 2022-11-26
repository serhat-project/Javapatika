import java.util.*;

public class TicketPriceApp {


    public static void main(String[] args) {

        int age, tripType, distance;


        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz :");
        distance = input.nextInt();

        System.out.print("Yaşınızı giriniz :");
        age = input.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        tripType = input.nextInt();
        double normalPrice = distance * 0.10;
        double finalPrice = 0;
        double discountPrice;
        if ((distance > 0) & (age > 0) & (tripType == 1 | tripType == 2)) {

            if (age < 12) {
                discountPrice = normalPrice * 0.50;
            } else if (age > 12 & age < 24) {
                discountPrice = normalPrice * 0.90;
            } else if ((age > 65)) {
                discountPrice = normalPrice * 0.70;
            } else {
                discountPrice = normalPrice;
            }


            if (tripType == 2) {
                finalPrice = (discountPrice * 0.80) * 2;
            } else {
                finalPrice = discountPrice;
            }

        }else {
            System.out.println("Hatalı veri girdiniz!");
            System.exit(0);
        }
        System.out.println("Toplam Tutar : " + finalPrice + " TL");
    }
}
