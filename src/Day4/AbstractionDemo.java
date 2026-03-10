package Day4;
abstract class Hero{
    private String Name;
    public Hero(String Name){
        this.Name=Name;
    }
    //abstract void add();
    public String getName(){
        return Name;
    }
    abstract void power();
    public static void information(){
        System.out.println("DC SuperHeroes");
    }

}
class WonderWoman extends Hero{
    public WonderWoman(String name){
        super(name);
    }
    @Override
    void power(){
        System.out.println(getName());
    }
}
public class AbstractionDemo {
    public static void main(String[] args) {
      Hero.information();
      Hero hero1=new WonderWoman("Gal Gadot");
      hero1.power();
      //hero1.getName();
    }
}
