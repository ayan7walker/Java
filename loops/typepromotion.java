public class typepromotion {
    public static void main(String args[]) {

        // Case 1: byte + byte = int (Java khud int bana deta hai)
        byte a = 10;
        byte b = 20;
        int result1 = a + b;  // byte nahi, int banana padega
        System.out.println("byte + byte = " + result1);

        // Case 2: int + float = float
        int num = 10;
        float f = 5.5f;
        float result2 = num + f;  // int promote ho gaya float mein
        System.out.println("int + float = " + result2);

        // Case 3: int + double = double
        int x = 10;
        double d = 20.5;
        double result3 = x + d;  // int promote ho gaya double mein
        System.out.println("int + double = " + result3);

        // Case 4: long + double = double
        long l = 100L;
        double d2 = 9.99;
        double result4 = l + d2;  // long promote ho gaya double mein
        System.out.println("long + double = " + result4);

        // Case 5: char + int = int
        char ch = 'A';  // A ki value hoti hai 65
        int result5 = ch + 1;  // char promote ho gaya int mein
        System.out.println("char + int = " + result5);  // 66 aayega
    }
}