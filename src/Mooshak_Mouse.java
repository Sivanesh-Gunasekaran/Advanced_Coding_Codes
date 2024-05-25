import java.util.Scanner;

public class Mooshak_Mouse {
    /*public static String modifyString(String input) {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Skip space characters
            if (ch == ' ') {
                continue;
            }

            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Increment ASCII value by 1 and append to output
                output.append((char) (ch + 1));
            } else {
                // Append non-letter characters as they are
                output.append(ch);
            }
        }

        return output.toString();
    }*/

    public static void main(String[] args) {
        int num = 10;
        for(;num != 0;){
            System.out.println(num++ + " ");
        }
    }
}