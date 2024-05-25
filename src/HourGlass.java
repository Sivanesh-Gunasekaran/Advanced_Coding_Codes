import java.util.Scanner;

public class HourGlass {
    static int row = 5;
    static int col = 5;

    static int findMaxSum(int[][] mat) {
        if (row < 3 || col < 3) {
            System.out.println("Not possible to give");
            System.exit(0);
        }
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < row - 2; i++) {
            for (int j = 0; j < col - 2; j++) {
                int sum = (mat[i][j] + mat[i][j + 1] + mat[i][j + 2]) + (mat[i + 1][j + 1])
                        + (mat[i + 2][j] + mat[i + 2][j + 1] + mat[i + 2][j + 2]);
                max_sum = Math.max(max_sum, sum);
            }
        }
        return max_sum;
    }

    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] mat = new int[row][col];
        System.out.println("Enter elements of the matrix (5x5):");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        int res = findMaxSum(mat);
        System.out.println("Maximum sum of hourglass = " + res);

        scanner.close();
    }
}