package Sapthagiri;

public class Constructor {
    String Name;
    Constructor(){
        System.out.println("Default Constructor");

    }
    Constructor(String Name){
        this();//Invoking Default to Parametrized
        this.Name=Name;
    }
    void display(){
        System.out.println(Name);
    }
    public static void main(String[] args) {
        Constructor c=new Constructor("Rohit Sharma");
        c.display();

    }
}
