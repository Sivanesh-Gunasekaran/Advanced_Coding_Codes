import java.util.*;

public class BBB{
    public static void main(String[] args){
        int a = 10;
        int b = 5;
        int bitA = Integer.parseInt(Integer.toBinaryString(a));
        int bitB = Integer.parseInt(Integer.toBinaryString(b));
        //System.out.println(bitA);
        //System.out.println(bitB);
        a = bitA^bitB;
        b = a^bitB;
        a = a^bitA;
        System.out.println(Integer.parseInt(String.valueOf(a),2));
        System.out.println(Integer.parseInt(String.valueOf(b),2));
    }
}