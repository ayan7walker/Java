package functions;

public class factorial {

    public static int factorialx(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    //main class

    public static void main(String args[]) {
        int result = factorialx(5);
        System.out.println("Factorial: " + result);
    }
}