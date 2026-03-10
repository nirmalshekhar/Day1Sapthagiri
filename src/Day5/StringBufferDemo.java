package Day5;
import java.util.Scanner;
public class StringBufferDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        StringBuffer sb=new StringBuffer(input);
        //append()
        sb.append("Alien Force");
        System.out.println(sb);

        //insert()
        sb.insert(0,"XLR8");
        System.out.println(sb);

        //delete()
        sb.delete(0,5);
        System.out.println(sb);

        //replace()
        sb.replace(3,7,"UltimateAlien");
        System.out.println(sb);

        //reverse()
        sb.reverse();
        System.out.println(sb);

    }
}
