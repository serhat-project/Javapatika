public class HarmonikOrtalama {
    public static void main(String[] args) {
        // verilen dizi
        double[] sayilar = {2, 4, 6, 8, 10};

        double toplam = 0.0;

        // elemanların harmonik serisi toplamını hesaplayalım
        for (double v : sayilar) {
            toplam += 1.0 / v;
        }

        // Harmonik ortalamayı hesaplayalım
        double harmonikOrtalama = sayilar.length / toplam;

        // Sonucu ekrana yazdıralım
        System.out.printf("Harmonik Ortalama :%5.2f", harmonikOrtalama);
    }
}