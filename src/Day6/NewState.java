package Day6;
class MyThread extends Thread{
    public void run(){
        System.out.println("Thread Running");
    }
}
public class NewState {
    public static void main(String[] args) {
        MyThread t1=new MyThread();//NEW State
        t1.start();//creating a new thread/running
        //t1.run();//Normal method call
        System.out.println("State :"+t1.getState());

    }
}
