package Day7;
class A{}
class B{}
public class Deadlock {
    static A objA=new A();
    static B objB=new B();
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            synchronized (objA){
                System.out.println("Thread 1 locked ObjA");
                try{
                    Thread.sleep(10000);
                }
                catch(Exception e){}
                System.out.println("Thread 1 waiting for ObjB");
                synchronized (objB){
                    System.out.println("Thread 1 locked objB");
                }
            }
        });
        Thread t2=new Thread(()->{
            synchronized (objB){
                System.out.println("Thread 2 locked ObjB");
                try{
                    Thread.sleep(10000);
                }
                catch(Exception e){}
                System.out.println("Thread 2 waiting for ObjA");
                synchronized (objA){
                    System.out.println("Thread 2 locked objA");
                }
            }
        });
        t1.start();
        t2.start();

    }

}

//Deadlock->occurs when two or more threads are
//waiting for each others resource , and none of them can proceed.
//result: Program gets stuck forever

//example:
//Thread 1 locks object A and waits for Object B
//Thread 2 locks object B and waits for object A