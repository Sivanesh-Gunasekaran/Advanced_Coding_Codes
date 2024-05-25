public class SortedPermutations {

    public static void main(String[] args) {
        String input = "AAB";
        char[] chars = input.toCharArray();
        sort(chars);
        permute(chars, 0);
    }

    // Function to sort the character array using bubble sort
    private static void sort(char[] chars) {
        int n = chars.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (chars[j] > chars[j + 1]) {
                    // Swap chars[j] and chars[j + 1]
                    char temp = chars[j];
                    chars[j] = chars[j + 1];
                    chars[j + 1] = temp;
                }
            }
        }
    }

    // Function to generate permutations recursively
    private static void permute(char[] chars, int index) {
        if (index == chars.length - 1) {
            System.out.println(new String(chars));
            return;
        }

        for (int i = index; i < chars.length; i++) {
            if (canSwap(chars, index, i)) {
                swap(chars, index, i);
                permute(chars, index + 1);
                swap(chars, index, i); // backtrack
            }
        }
    }

    // Function to check if we can swap chars[i] and chars[j]
    private static boolean canSwap(char[] chars, int start, int curr) {
        for (int i = start; i < curr; i++) {
            if (chars[i] == chars[curr]) {
                return false;
            }
        }
        return true;
    }

    // Function to swap characters in an array
    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}