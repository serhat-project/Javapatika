public class AsalySayiKontrol {

    public static void main(String[] args) {

        int sayi = 22;
        if (asalKontrol(sayi, sayi / 2)) {
            System.out.println(sayi + " sayısı ASAL'dır !");
        } else {
            System.out.println(sayi + " sayısı ASAL değildir !");
        }
    }

    public static boolean asalKontrol(int sayi, int kontrolSayisi) {

        if (kontrolSayisi == 1) {
            return true;
        } else {
            if (sayi % kontrolSayisi == 0) {
                return false;
            } else {
                return asalKontrol(sayi, kontrolSayisi - 1);
            }
        }
    }
}