import java.util.*;

public class Maneuvering {

    static int numberOfPaths(int m, int n){
        int[] dp = new int[n];
        dp[0] = 1;
        for(int i = 0; i < m; i++){
            for(int j = 1; j < n; j++){
                dp[j] += dp[j - 1];
            }
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter the m: ");
        int m = 3;
        //System.out.print("Enter the n: ");
        int n = 3;
        System.out.println(numberOfPaths(m, n));
    }
}
