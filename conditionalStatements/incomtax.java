package conditionalStatements;

import java.util.Scanner;

public class incomtax {


    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tax;

        int a;
        System.out.println("Enter your Monthly income");
        a = sc.nextInt();

        if (a <= 30000) {
            tax = 0;
        } 
        else if (a <= 50000) {
            tax = a * 10 / 100;
        } 
        else if (a <= 100000) {
            tax = a * 20 / 100;
        } 
        else {
            tax = a * 30 / 100;
        }

        System.out.println("Your tax is " + tax);
    }
}
