
package loops;

import java.util.Scanner;

public class breakkro {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter your number");
            int input = sc.nextInt();

            if (input % 10 == 0) {
                break;

            }
            System.out.println(input);

        } while (true);

    }
}