public class PrimeCalculator {

    public static int nth(int i) {

        int counter = 0;
        int n = 1;

        if (i <= 0) {
            throw new IllegalArgumentException();
        }

        do {
            n++;
            if (checkPrime(n)) {
                counter++;
            }
        } while (counter != i);

        return n;
    }

    static boolean checkPrime(int n) {
        boolean isPrime = false;
        int flag = 1;
        int m = n / 2;

        for (int i = 2; i <= m; i++) {
            if (n % i == 0) {
                isPrime = false;
                flag = 0;
                break;
            }
        }

        if (flag == 1) {
            isPrime = true;
        }

        return isPrime;
    }
}