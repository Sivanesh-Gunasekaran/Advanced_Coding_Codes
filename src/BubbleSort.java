import java.util.*;
public class BubbleSort {
    static boolean swapped;
    public static void main(String[] args) {
        LinkedList<> ll = new LinkedList();
        int[] arr = {1, 2, 3, 4, 5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        //run the steps n-1 time
        for(int i = 0; i < arr.length; i++){
            //for each step, max item will come at last as sorted
            for(int j = 1; j < arr.length - i; j++){
                //swap if j is smaller than j-1
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
