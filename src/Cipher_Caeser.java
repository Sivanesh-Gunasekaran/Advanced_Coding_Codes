import java.util.*;
public class Cipher_Caeser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int key = in.nextInt();
        int len = str.length();
        char[] res = new char[len+1];
        int pos = 0;
        int val = 0;
        for(int ind = 0; ind < len; ind++){
            char ch = str.charAt(ind);
            if(ch == ' '){
                continue;
            }
            else if (ch == ' ') {
                val = (int)('-');
            }
            else if (ch >= 0 && ch <= 9) {
                val = (int)(ch - '0');
                val += key;
                val = ((val%10) + '0');
            }
            else if (ch >= 'a' && ch <= 'z') {
                val = (int)(ch - 'a');
                val += key;
                val = ((val%26) + 'a');
            }
            else if (ch >= 'A' && ch <= 'Z') {
                val = (int)(ch - 'A');
                val += key;
                val = ((val%26) + 'A');
            }
            res[pos++] = (char)(val);
        }
        System.out.println(val);
    }
}
