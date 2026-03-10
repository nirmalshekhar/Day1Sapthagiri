package Day9;
import java.util.LinkedList;
public class LinkedListInsertion {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<Integer>();
        //addLast
        ll.add(10);
        ll.addLast(20);
        //AddFirst->Beginning
        ll.addFirst(30);
        //specific index
        ll.add(2,45);
        System.out.println(ll);
    }
}
