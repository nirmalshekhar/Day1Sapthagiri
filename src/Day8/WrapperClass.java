package Day8;
public class WrapperClass {
    public static void main(String[] args) {
        //Autoboxing: Primitive to Wrapper object
        int a=5;
        Integer obj=a;
        System.out.println(obj);

        //AutoUnboxing:Wrapper object to Primitive
        Integer b=10;
        int c=b;
        System.out.println(c);

        //Wrapper class methods
        Integer num=50;
        System.out.println(num);
        //ComapreTo
        System.out.println(num.compareTo(60));
        //equals
        System.out.println(num.equals(50));
        //max
        System.out.println(Integer.max(10,20));
        //min
        System.out.println(Integer.min(10,20));
        //parseInt
        System.out.println(Integer.parseInt("3000"));
        //Number to string
        System.out.println(num.toString());

    }
}
