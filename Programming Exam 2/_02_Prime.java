public class _02_Prime {
    public static boolean isPrime(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 97;
        System.out.println(isPrime(n));
    }
}
