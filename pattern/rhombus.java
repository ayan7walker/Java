package pattern;


public class rhombus {

    public static void solidRhombus(int n) {

        // Outer loop
        for (int i = 1; i <= n; i++) {

            // Spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 5;
        solidRhombus(n);
    }
}