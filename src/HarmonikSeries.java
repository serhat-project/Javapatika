public class HarmonikSeries {
    public static void main(String[] args) {
        // Girilen sayı
        int n = 5;

        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum = sum + (1.0 / i);
        }

        System.out.println("Harmonik serisi: " + sum);
    }
}

