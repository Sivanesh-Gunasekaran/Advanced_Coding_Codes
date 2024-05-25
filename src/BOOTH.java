import java.util.*;

public class BOOTH {
    public static int GCD(int a, int b){
        if(a == 0){
            return b;
        }
        else{
            return GCD(b%a, a);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First number: ");
        int a = sc.nextByte();
        System.out.print("Second number: ");
        int b = sc.nextByte();
        int gcd = GCD(a, b);
        System.out.println("GCD of number: "+gcd);
    }
}