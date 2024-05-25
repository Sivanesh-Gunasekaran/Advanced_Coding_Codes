import java.util.*;

public class Main{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(1, 10);
        list.add(2, 34);
        list.add(3, 24);
        list.add(4, 12);
        list.add(5, 40);
        System.out.println(list);
        list.remove(3);
        list.addFirst(50);
        System.out.println(list);
    }
}