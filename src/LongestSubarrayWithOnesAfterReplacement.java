import java.util.Scanner;

public class LongestSubarrayWithOnesAfterReplacement {

    private static int findMaxConsecutiveOnes(int[] nums, int k) {
        int maxLength = 0;
        int windowStart = 0;
        int maxOnesCount = 0;

        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            if (nums[windowEnd] == 1) {
                maxOnesCount++;
            }

            // If the number of zeros in the current window exceeds k, shrink the window
            // until it contains at most k zeros.
            if (windowEnd - windowStart + 1 - maxOnesCount > k) {
                if (nums[windowStart] == 1) {
                    maxOnesCount--;
                }
                windowStart++;
            }

            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array
        System.out.print("Enter the elements of the array separated by space:");
        String[] input = scanner.nextLine().split(" ");
        int[] nums = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        // Input k
        System.out.print("Enter the maximum number of zeros that can be flipped:");
        int k = scanner.nextInt();

        int result = findMaxConsecutiveOnes(nums, k);
        System.out.println("Length of longest contiguous subarray containing only 1s after replacement = " + result);
    }
}