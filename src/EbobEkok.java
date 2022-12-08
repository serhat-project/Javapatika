
public class EbobEkok {
    public static void main(String[] args) {
        int n1 = 18;
        int n2 = 24;

        int ebob = 1;
        int kucukSayi;

        if (n1 > n2) {
            kucukSayi = n2;
        } else {
            kucukSayi = n1;
        }

        int i = 1;

        while (i <= kucukSayi) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        int ekok = (n1 * n2) / ebob;

        System.out.println("EBOB(" + n1 + "," + n2 + ") = " + ebob);
        System.out.println("EKOK(" + n1 + "," + n2 + ") = " + ekok);
    }
}