package Sapthagiri;

public class Avengers {
    String Name;//Instance Variable
    Avengers(String Name){
        this.Name=Name;
    }
    void display(){
        System.out.println(Name);
    }

    public static void main(String[] args) {
        Avengers ob=new Avengers("Iron Man");
        ob.display();

    }
}
