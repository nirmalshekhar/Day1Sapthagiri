package Sapthagiri;
class SuperHero{
    void Fight()
    {
        System.out.println("SuperHeroes Save World");
    }
}
class Batman extends SuperHero{
    void Identity(){
        System.out.println("Hello Bruce Wayne");
    }
}
class SuperMan extends SuperHero{
    void Identity2()
    {
        System.out.println("Henry Cavil");
    }

}
public class DC {
    public static void main(String[] args) {
        Batman b=new Batman();
        b.Fight();
        b.Identity();

        SuperMan s=new SuperMan();
        s.Fight();
        s.Identity2();

    }
}
