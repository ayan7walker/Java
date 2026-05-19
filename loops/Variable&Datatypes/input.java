//inout in java 

import java.util.*;

public class input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();// space ke baad nhi input lega
        String name = sc.nextLine();// space ke bad ka input lega



        int num = sc.nextInt();





        System.out.println("Enter 1st " + input);
        // yaha pe space ke baad bhi print krega
        System.out.println(" 2nd " + name);

        System.out.println("3rd"+ num);


    }

}