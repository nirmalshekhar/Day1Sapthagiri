package Day9;
import java.util.ArrayList;
public class ArrayListNoGenerics {
    public static void main(String[] args) {
        ArrayList<Object> list=new ArrayList<Object>();
        list.add(10);
        list.add("Hii");
        list.add(3.14);
        list.add(true);
        System.out.println("List :"+list);
        for(int i=0;i< list.size();i++){
            Object num=(Object)list.get(i);
            System.out.println("Number :"+num);
        }
    }
}
