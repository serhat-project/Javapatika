import java.util.Scanner;

public class AccessLog {
    public static void main(String[] args) {

        String userName, password, newPassword;
        int secim;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adı: ");
        userName = input.nextLine();


        System.out.print("Şifre: ");
        password = input.nextLine();

        if (userName.equals("javauser") && password.equals("Ankara123"))
            System.out.println("Giriş Yaptınız !");

        else  {
            System.out.print("Şifreniz yanlış. Şifrenizi sıfırlamak için 1'e basınız.\nCıkış yapmak için 0'a basınız ");
            secim =input.nextInt();

            switch (secim) {
                case 0 -> {
                    System.out.println("Sistemden çıktınız.");
                    System.exit(0);
                }

                case 1 -> {
                    Scanner inp = new Scanner(System.in);
                    System.out.print("Lütfen yeni şifrenizi giriniz: ");
                    newPassword = inp.nextLine();

                    if (newPassword.equals("Ankara123")) {
                        System.out.println("Şifreniz eski şifrenizden farklı olmalıdır\nLütfen yeni şifrenizi giriniz: ");
                    }
                    else {
                        System.out.println("Şifreniz değiştirildi. Yeni şifreniz: " + newPassword);
                    }

                }
            }
        }

    }
}
