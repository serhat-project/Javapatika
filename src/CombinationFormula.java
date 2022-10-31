public class CombinationFormula {
    public static void main(String[] args) {
        int a=6;
        int r=2;

        int result= Combination(a) / (Combination(r) * Combination((a-r)));
        System.out.println(result);

    }

    public static int Combination(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

