
//maximum  sub  array  using sum prefix method 
package array;

public class max2subarray {

    public static int maxSubarraySum(int[] numbers) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int[numbers.length];

        // Calculate prefix array
        prefix[0] = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        // Find maximum subarray sum
        for (int start = 0; start < numbers.length; start++) {

            for (int end = start; end < numbers.length; end++) {

                currSum = (start == 0)
                        ? prefix[end]
                        : prefix[end] - prefix[start - 1];

                System.out.println(currSum);

                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Max Sum = " + maxSum);
        return maxSum;
    }

    public static void main(String[] args) {

        int numbers[] = {2, 4, 6, 8, 10};
        maxSubarraySum(numbers);

    }
}







