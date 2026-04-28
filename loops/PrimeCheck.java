import java.util.Scanner;
package loops;

public class PrimeCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        // Edge case: numbers <= 1 are not prime
        if (n <= 1) {
            System.out.println(n + " is NOT prime");
            return;
        }

        boolean isPrime = true;

        // Loop from 2 to n/2
        for (int i = 2; i <= n / 2; i++) {

            // DRY RUN EXAMPLE:
            // Suppose n = 10
            // i = 2 → 10 % 2 == 0 → divisible → NOT prime

            if (n % i == 0) {
                isPrime = false;
                break; // no need to check further
            }
        }

        // Final result
        if (isPrime) {
            System.out.println(n + " is PRIME");
        } else {
            System.out.println(n + " is NOT PRIME");
        }

        sc.close();
    }
}