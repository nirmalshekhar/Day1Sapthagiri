package Package2;
import Package1.Person;

public class Student extends Person  {
    public void displayDetails()
    {
        //Person p1=new Person();
        System.out.println("Public"+name);
        System.out.println("Protected "+age);
        //showName();
        showAge();
    }
    public static void main(String[] args) {
        Student s=new Student();
        s.displayDetails();

        Person p=new Person();
        System.out.println("Public outside:"+p.name);
        //System.out.println("Public outside:"+p.age);

    }
}
