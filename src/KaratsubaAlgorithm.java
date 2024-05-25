import java.math.BigInteger;
import java.util.Scanner;

public class KaratsubaAlgorithm {
//
    public static BigInteger karatsuba(BigInteger x, BigInteger y) {
        int n = Math.max(x.bitLength(), y.bitLength());

        // Base case: if either x or y is small, use standard multiplication
        if (n <= 2000) {
            return x.multiply(y);
        }

        // Split the numbers into two halves
        int half = (n + 32) / 64 * 32; // round up to the nearest multiple of 64 bits
        BigInteger mask = BigInteger.ONE.shiftLeft(half).subtract(BigInteger.ONE);
        BigInteger xLow = x.and(mask);
        BigInteger yLow = y.and(mask);
        BigInteger xHigh = x.shiftRight(half);
        BigInteger yHigh = y.shiftRight(half);

        // Recursive steps
        BigInteger z0 = karatsuba(xLow, yLow);
        BigInteger z1 = karatsuba(xLow.add(xHigh), yLow.add(yHigh));
        BigInteger z2 = karatsuba(xHigh, yHigh);

        // Combine the results
        BigInteger result = z2.shiftLeft(2 * half).add(z1.subtract(z2).subtract(z0).shiftLeft(half)).add(z0);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the first number
        System.out.print("Enter the first number: ");
        BigInteger x = scanner.nextBigInteger();

        // Prompt user to enter the second number
        System.out.print("Enter the second number: ");
        BigInteger y = scanner.nextBigInteger();

        // Call the karatsuba function to calculate the product
        BigInteger product = karatsuba(x, y);

        // Print the product
        System.out.println("Product: " + product);
    }
}
