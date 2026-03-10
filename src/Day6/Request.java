package Day6;
//requesting Garbage Collection
public class Request {
    public static void main(String[] args) {
        Request r=new Request();
        r=null;
        System.gc();
        System.out.println("GC requested");
    }
}
