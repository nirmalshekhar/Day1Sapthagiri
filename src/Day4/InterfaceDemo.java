package Day4;
interface Human{
    void power();
    default void identity(){
        System.out.println("Gangadhar");
    }
}
interface Energy{
    default void energy(){
        System.out.println("Sun");
    }
}
class Shaktiman implements Human,Energy{
    @Override
    public void  power(){
        System.out.println("Five elements");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
       Human h1=new Shaktiman();
       h1.power();
       h1.identity();
    }
}
