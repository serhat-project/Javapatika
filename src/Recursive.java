public class Recursive {
        static int N;

        public static void main(String[] args) {
            N = 25;
            System.out.println(N);
            subtract(N);
        }

        private static void subtract(int N) {
            if (N <= 0) {
                add(N);
            } else {
                N -= 5;
                System.out.println(N);
                subtract(N);
            }
        }

        private static void add(int N) {
            if (N >= Recursive.N) {
                System.exit(0);
            } else {
                N += 5;
                System.out.println(N);
                add(N);
            }
        }
    }