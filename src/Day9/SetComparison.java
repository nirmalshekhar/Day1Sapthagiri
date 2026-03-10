package Day9;
import java.util.*;
public class SetComparison {
    public static void main(String[] args) {
        Set<Integer> hashset=new HashSet<>(Arrays.asList(30,10,50,20,40));
        Set<Integer> Linkedhashset=new LinkedHashSet<>(Arrays.asList(30,10,50,20,40));
        Set<Integer> Treeset=new TreeSet<>(Arrays.asList(30,10,50,20,40));
        System.out.println("HashSet(Unordered Set) :"+hashset);
        System.out.println("LinkedHashSet(Ordered Set) :"+Linkedhashset);
        System.out.println("TreeSet(Sorted Set) "+Treeset);
    }
}
