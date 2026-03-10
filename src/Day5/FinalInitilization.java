package Day5;
class Final
{
    final int x;
    Final(int x){
        this.x=x;
    }
    void display(){
        System.out.println(x);
    }
}
public class FinalInitilization {
    public static void main(String[] args) {
        Final f=new Final(5 );
        f.display();

    }
}
