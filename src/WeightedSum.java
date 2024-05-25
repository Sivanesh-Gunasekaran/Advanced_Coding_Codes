import java.util.*;

class WeightedSubstring{
    public static int Substring(String str, int K, int N){
        HashSet<String> substring = new HashSet<>();
        for(int i = 0; i < N; ++i){
            int sum = 0;
            String s = "";
            for(int j = i; j < N; ++j){
                char ch = str.charAt(j);
                int currentWeight = ch - 'a' + 1; //ASCII value changing (a-a+1 return 1)

                sum += currentWeight;
                s += ch;

                if(sum == K){
                    substring.add(s);
                }
                else if(sum > K){
                    break;
                }
            }
        }
        return substring.size();
    }

    public static void main(String[] args) {
        String str = "abced";
        int K = 4;
        int N = str.length();
        int res = Substring(str, K, N);
        System.out.println(res);
    }
}