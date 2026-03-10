package Sapthagiri;
class car{
    void model(){
        System.out.println("RaceCar");
    }
}
class Formula1 extends car{
  //@Override
    void model1(){
        System.out.println("Formula1- Buddha Circuit New Delhi");
    }
}
public class Vehicle {
    public static void main(String[] args) {
        car f=new Formula1();
        f.model();

    }
}
