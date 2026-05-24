//Passing arrays as a arguments;

//there is 2 method of paasing a varibale  

//pass by value 
//pass by reference

import java.util.*;

public class passarg {

    public static void update(int marks[], int nonchnageble) {

        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }

        nonchnageble = 17; // won't affect original
    }

    public static void main(String args[]) {
        int marks[] = {97, 98, 99};
        int nonchnageble = 5;

        update(marks, nonchnageble);

        // print marks
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        // check nonchnageble
        System.out.println(nonchnageble);
    }
}