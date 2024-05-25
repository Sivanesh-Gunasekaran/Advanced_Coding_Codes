import java.util.*;

public class maximumProductSubArray {
    public static int maxProduct(int[] nums) {
        // Edge case: Empty array
        if (nums == null || nums.length == 0)
            return 0;

        int maxSoFar = nums[0]; // Initialize maximum product so far
        int minSoFar = nums[0]; // Initialize minimum product so far
        int maxProduct = nums[0]; // Initialize maximum product

        // Iterate through the array
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];

            // Update maxSoFar and minSoFar for the current index
            int tempMax = Math.max(curr, Math.max(maxSoFar * curr, minSoFar * curr));
            minSoFar = Math.min(curr, Math.min(maxSoFar * curr, minSoFar * curr));
            maxSoFar = tempMax;

            // Update the maximum product found so far
            maxProduct = Math.max(maxProduct, maxSoFar);
        }

        return maxProduct;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4, 1};
        System.out.println("Maximum product subarray: " + maxProduct(nums));
    }
}