import java.util.*;

public class blessytest {
    public static void main(String[] args) {
        char ch = 'f'; // Initialize character ch with 't'
        int bin = ch - 'a' + 1; // Calculate the position of 't' in the alphabet
        System.out.println("Position in alphabet: " + bin); // Print the position (should output 20)

        // Ensure the binary string is at least 8 bits for consistent nibble swapping
        String binary = Integer.toBinaryString(bin);
        binary = String.format("%8s", binary).replace(' ', '0');
        System.out.println("Binary representation: " + binary); // For debugging

        // Convert the binary string to an integer
        int binInt = Integer.parseInt(binary, 2);

        // Swap the nibbles
        int swapnum = ((binInt & 0x0F) << 4) | ((binInt & 0xF0) >> 4);
        System.out.println("Swapped number: " + swapnum); // Print the swapped number

        // Convert the swapped number to an ASCII character
        char resultChar = (char) swapnum;
        System.out.println("Resulting character: " + resultChar); // Print the resulting ASCII character, should be 'G'
    }
}
