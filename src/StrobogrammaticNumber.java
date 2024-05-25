import java.util.*;

class StrobogrammaticNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String n = sc.nextLine();
        if(isstrobogrammatic(n) != false){
            System.out.println("Yes");
        }else{
            System.out.println("false");
        }
        sc.close();
    }

    public static boolean isstrobogrammatic(String n){
        Map<Character, Character> dictionary = new HashMap<>();
        dictionary.put('0', '0');
        dictionary.put('1', '1');
        dictionary.put('8', '8');
        dictionary.put('6', '9');
        dictionary.put('9', '6');

        int i = 0;
        int j = n.length()-1;

        while (i <= j){
            char low = n.charAt(i);
            char high = n.charAt(j);

            if(!dictionary.containsKey(low) || dictionary.get(low) != high){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}