package Sapthagiri;

public class IIB {
    int runs;
    String Name;
    {//IIB-Instance Initialization Block
      System.out.println("Inside IIB");
      Name="Virat Kohli";
      runs=183;
    }
    static{
        System.out.println("Static Block");
    }
    IIB(){
        System.out.println("Inside Constructor");
        //runs=264;
        //Name="Rohit Sharma";
    }
    void display(){
        System.out.println(Name+" "+runs);
    }
    public static void main(String[] args) {
        IIB ob=new IIB();
        ob.display();

        IIB ob1=new IIB();
        ob1.display();

    }
}
