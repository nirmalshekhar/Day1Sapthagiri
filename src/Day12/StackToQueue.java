package Day12;
import java.util.Stack;
class MyQueue{
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();
    public void push1(int x){
        s1.push(x);
    }
    public int pop1(){
        if (s2.isEmpty()) {
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
    public int peek1(){
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }
    public boolean empty(){
        return s1.isEmpty() && s2.isEmpty();
    }
 }
public class StackToQueue {
    public static void main(String[] args) {
        MyQueue queue=new MyQueue();
        queue.push1(10);
        queue.push1(20);
        queue.push1(30);
        queue.push1(40);

        System.out.println("Front (peek) "+queue.peek1());

        System.out.println("Removed (pop) "+queue.pop1());
        System.out.println("Front (peek) "+queue.peek1());

        System.out.println("Is queue Empty "+queue.empty());
    }
}
