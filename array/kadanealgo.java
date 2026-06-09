//maximum subarray sum kadane's algorithm
// Kadane's Algorithm:
// Maximum Subarray Sum nikalne ka sabse efficient algorithm hai.
//  Isme hum array ko ek hi baar traverse karte hain.
// currSum me current subarray ka sum rakhte hain.
// Agar currSum negative ho jaye to usse 0 kar dete hain, kyunki negative sum future answer ko kam karega.
// Har step par maxSum update karte rehte hain.
// Time Complexity: O(n)
// Space Complexity: O(1)
// Ek line me:
// "Kadane's Algorithm array me continuous elements ka maximum possible sum sirf ek traversal me find karta hai."

package array;



public class kadanealgo {
    
public static void kadanes(int numbers[]) {

    int ms = Integer.MIN_VALUE;
    int cs = 0;

    for (int i = 0; i < numbers.length; i++) {

        cs = cs + numbers[i];

        if (cs < 0) {
            cs = 0;
        }

        ms = Math.max(cs, ms);
    }

    System.out.println("max sum = " + ms);
}

public static void main(String args[]) {

    int numbers[] = {1, -2, 6, -1, 3};

    kadanes(numbers);
}
}
