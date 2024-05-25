import java.util.Scanner;

public class SwapNibble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String n1 = sc.nextLine();
        System.out.print("Enter a number: ");
        int n2 = sc.nextInt();
        System.out.println(n1+n2);
    }
}