import java.util.*;

public class HyphenSwap {
    static void moveSpaceInfront(char str[]){
        //Traverse from end swap function
        int i = str.length-1;
        for(int j = i; j >= 0; j--){
            if(str[j] != '-'){
                char c = str[i];
                str[i] = str[j];
                str[j] = c;
                i--;

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String n = sc.nextLine();
        char str[] = n.toCharArray();
        moveSpaceInfront(str);
        System.out.println("Output: "+String.valueOf(str));
    }
}
