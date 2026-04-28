package conditionalStatements;

import java.util.Scanner;

public class largestof3 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();

        if (input1 > input2 && input1 > input3) {
            System.out.println("input 1 is greatest");

        } else if (input2 > input1 && input2 > input3) {
            System.out.println("input 2 is greatest");

        } else if (input3 > input1 && input3 > input2) {
            System.out.println("input 3 is greatest");

        } else {
            System.out.println("All are same number");
        }
    }
}

