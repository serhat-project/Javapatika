import java.util.Scanner;

public class PalindromWord {

    public static void main(String[] args) {

        // Kullanıcının girdiği kelimeyi tutmak için bir string alıyoruz.
        String str;
        System.out.println("Lütfen palindromik kelime kontrol etmek için bir kelime giriniz: ");
        Scanner sc = new Scanner(System.in);

        // Kullanıcıdan kelime alınıyor
        str = sc.nextLine();

        // Kullanıcının girdiği kelimeyi tersten okunmuş hali
        StringBuilder reverseStr = new StringBuilder();

        // Kullanıcının girdiği kelimeyi tersten okuma
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr.append(str.charAt(i));
        }

        // Palindromik kelime olup olmadığı kontrol ediliyor
        if (reverseStr.toString().equals(str))
            System.out.println("Girdiğiniz kelime palindromik bir kelimedir!");
        else
            System.out.println("Girdiğiniz kelime palindromik bir kelime değildir!");
    }
}
