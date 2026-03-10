package Day8;
import java.util.ArrayList;
public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=20;i++){
            list.add(i);
        }
        for(int i=0;i<list.size();i++){
            if(list.get(i)>7)
            {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);

    }
}
