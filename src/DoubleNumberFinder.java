public class DoubleNumberFinder {

    public static void main(String[] args) {

        // Belirlenen sayı dizisi
        int[] numbers = {3, 6, 8, 4, 8, 6, 5, 4, 9, 3, 2, 10, 13, 15, 2};

        // Tekrarlayan çift sayıları bulmak için kullanılan dizi
        int[] doubleNumbers = new int[numbers.length];

        int index = 0;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length; j++) {

                // Her iki sayı eşitse
                if ((i != j) && (numbers[i] == numbers[j])) {

                    // Bir diziye ekle
                    doubleNumbers[index] = numbers[i];
                    index++;
                }
            }
        }

        // Tekrarlayan çift sayıları ekrana yazdır
        System.out.println("Tekrarlayan Çift Sayılar: ");
        for (int i = 0; i < index; i++) {
            if(doubleNumbers[i]%2 == 0) {
                System.out.print(doubleNumbers[i] + " ");
            }
        }
    }
}
