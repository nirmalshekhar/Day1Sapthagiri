package Sapthagiri;
class Parent{
    void display(){
        System.out.println("Parent Class");
    }
}
class Child extends Parent{
    void displayChild(){
        System.out.println("Child CLass");
    }
}
public class Single {
    public static void main(String[] args) {
        Child c=new Child();
        c.display();
        c.displayChild();

        Parent p=new Parent();
        //p.displayChild();
        p.display();

    }

}
