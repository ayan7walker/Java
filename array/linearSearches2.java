package array;

public class linearSearches2 {

    public static int linearSearch(String fruits[], String target) {

        for (int i = 0; i < fruits.length; i++) {

            if (fruits[i].equals(target)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String args[]) {

        String fruits[] = {"apple", "orange", "pineapple", "banana"};

        String target = "banana";

        int index = linearSearch(fruits, target);

        if (index == -1) {
            System.out.println("Search not found");
        } else {
            System.out.println("Search found at index " + index);
        }
    }
}