package Day5;
class Engine{
    String type;
    Engine(String type){
        this.type=type;
    }
}
class car{
    Engine engine;
    car(String engineType){
        this.engine=new Engine(engineType);
    }
    void Show(){
        System.out.println("car has Engine"+engine.type);
    }
}
public class CompositionDemo {
    public static void main(String[] args) {
        car c=new car("Petrol Engine");
        c.Show();
    }
}
