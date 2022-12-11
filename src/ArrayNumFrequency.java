public class ArrayNumFrequency {
    public static void main(String[] args) {

        //Verilen dizi
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};

        //Kullanılacak değişken
        int count;

        //Elemanların frekanslarını bulmak için döngü
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            System.out.println(arr[i] + " sayısı  " + count + " kere tekrar edildi.");
        }
    }
}
