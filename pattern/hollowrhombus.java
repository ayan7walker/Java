package pattern;


public class hollowrhombus {

    public static void hollowRhombus(int n) {

        // Outer loop
        for (int i = 1; i <= n; i++) {

            // Spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // Hollow rectangle logic
            for (int j = 1; j <= n; j++) {

                // Boundary condition
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 5;
        hollowRhombus(n);
    }
}