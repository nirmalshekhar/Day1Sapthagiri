package Day7;
class MyThread3 extends Thread{
   public void run() {
       System.out.println(getName() + " started state " + getState());
       //Yield control to give other thread a chance
       Thread.yield();
       try{
           Thread.sleep(12000);
       }
       catch(InterruptedException e){
           System.out.println(getName() +"interrupted :"+e.getMessage());
       }
       System.out.println(getName() +" finished , state "+getState());
   }
}
public class ThreadMethods {
    public static void main(String[] args) {
        MyThread3 t1=new MyThread3();
        MyThread3 t2=new MyThread3();
        System.out.println("Before start , t1 is Alive or not "+t1.isAlive());

        t1.start();
        t2.start();
        //Again check state whether Alive or not
        System.out.println("After start t1="+t1.getState());
        System.out.println("After start t2="+t2.getState());

        try{
            t1.join();
            t2.join();
        }
        catch(InterruptedException e){
            System.out.println("Main Thread interrupted "+e.getMessage());
        }
        System.out.println("After Join T1 state ="+t1.getState());
        System.out.println("After join t2 state "+t2.getState());
        System.out.println("Check t1 alive ="+t1.isAlive());
        System.out.println("Check t2 alive ="+t2.isAlive());
    }
}

//Thread.yield()-> it only hints to thread schedular/only request
//priority basis-> can only request but doesnot gurantee that current thread will stop or that another thread will run.
//Main decider-> JVM and OS decides which thread gets paused
