// Linear Search Program
package array;

public class linearSearches {

    public static int linearSearch(int number[], int key) {

        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }

        return -1; // after checking all elements
    }

    
    public static void main(String args[]) {

        int number[] = {2, 4, 6, 8, 10, 12, 16};
        int key = 1;

        int index = linearSearch(number, key);

        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Key is at index " + index);
        }
    }
}