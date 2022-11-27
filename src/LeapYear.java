import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yıl giriniz: ");
        int year = scan.nextInt();
        System.out.println(Leap(year));
    }

    public static String Leap(int year) {
        if ((year % 100 == 0 & year % 400 == 0) | (year % 4 == 0 & year % 100 != 0)) {
            return "Leap Year";
        } else {
            return "Not Leap Year";
        }
    }


}

