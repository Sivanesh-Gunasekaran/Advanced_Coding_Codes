import java.util.*;

class maxones {
    public static int maxones(int[] arr, int k) {
        int maxones = 0;  // Initialize maxones to 0
        int numrep = 0;
        int start = 0;

        for (int end = 0; end < arr.length; end++) {
            if (arr[end] == 0) {
                numrep++;
            }
            while (numrep > k) {
                if (arr[start] == 0) {
                    numrep--;
                }
                start++;
            }
            maxones = Math.max(maxones, end - start + 1);
        }
        return maxones;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array (0s and 1s):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number of flips allowed:");
        int k = sc.nextInt();

        System.out.println("Maximum number of consecutive 1s after flipping at most " + k + " 0s: " + maxones(arr,k));
    }
}