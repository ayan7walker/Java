
//print sum  of first n natural number;

import java.util.Scanner;

public class sumofn {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int counter = 1;
        int sum = 0;

        while (counter <= input) {
            sum = sum + counter;
            counter++;
        }

        System.out.println("Sum = " + sum);
        sc.close();
    }
}