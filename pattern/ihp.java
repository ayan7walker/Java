package pattern;

// Inverted & Rotated Half Pyramid
public class ihp {

    public static void main(String args[]) {

        int n = 4;

        // Outer loop = rows
        for (int i = 1; i <= n; i++) {

            // Spaces loop
            // Line 1 -> 3 spaces
            // Line 2 -> 2 spaces
            // Line 3 -> 1 space
            // Line 4 -> 0 space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Stars loop
            // Line 1 -> 1 star
            // Line 2 -> 2 stars
            // Line 3 -> 3 stars
            // Line 4 -> 4 stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Next line after every row
            System.out.println();
        }
    }
}