package functions;

import java.util.*;

public class fnction {

    // function 1
    public static void printhelloworld() {
        System.out.println("Hello World");
    }

    // function 2
    public static void myname() {
        System.out.println("My Name  is Ayan  ");
    }

    // function 3

    public static void printnumber() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("The Required Answer is :"+sum);

    }

    // main class
    public static void main(String args[]) {
        printhelloworld();
        myname();
        printnumber();

    }
}
