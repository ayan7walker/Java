package functions;

public class range {

    // check prime
    public static boolean prime(int x) {
        if (x < 2)
          return false;
        for (int i = 2; i <= x - 1; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    // print primes in range
    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (prime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // main
    public static void main(String args[]) {
        primeInRange(3890);
    }
}