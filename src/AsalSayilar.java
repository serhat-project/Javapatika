public class AsalSayilar {

    public static void main(String[] args) {

        // 1 ile 100 arasındaki asal sayıları kontrol etmek için döngü oluşturuyoruz
        for(int i = 2; i <= 100; i++) {

            // i'nin asal olup olmadığını kontrol eden değişkeni tanımladık
            boolean asalMi = true;

            // i'ye kadarki tüm sayıları kontrol ediyoruz
            for(int j = 2; j < i; j++) {

                // i'nin j'ye bölünebiliyorsa asal değil
                if(i % j == 0) {
                    asalMi = false;
                    break;
                }
            }

            // Eğer asal ise ekrana yazdırıyoruz
            if(asalMi) {
                System.out.print(i + " ");
            }
        }
    }
}