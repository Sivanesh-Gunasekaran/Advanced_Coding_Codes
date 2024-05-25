import java.util.*;
public class Sieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean[] arr = new boolean[n+1];
        for(int i = 2; i <= n; i++){
            arr[i] = true;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            for(int j = i*i; j <= n; j+=i){
                arr[j] = false;
            }
        }
        for(int i = 2; i <= n; i++){
            if(arr[i]){
                System.out.print(i+" ");
            }
        }
    }
}