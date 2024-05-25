import java.util.*;

public class BlockSwap {
    public static void rotateArray(int[] arr, int rotations) {
        int n = arr.length;
        rotations = rotations % n;
        if (rotations == 0)
            return;

        swap(arr, 0, rotations - 1);
        swap(arr, rotations, n - 1);
        swap(arr, 0, n - 1);
    }

    public static void swap(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 10};
        int rotations = 5;
        rotateArray(arr, rotations);

        System.out.println("Rotated array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}