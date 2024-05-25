import java.util.*;
class MoveHyphen{
    public static void moveHyphen(char[] c){
        int i = c.length-1;
        for(int j = i; j >= 0; j--){
            if(c[j] != '-'){
                char temp = c[j];
                c[j] = c[i];
                c[i] = temp;
                i--;
            }
        }
    }

    public static void main(String[] args){
        String str = "Code--lyf";
        char[] c = str.toCharArray();
        moveHyphen(c);
        System.out.println(String.valueOf(c));
    }
}