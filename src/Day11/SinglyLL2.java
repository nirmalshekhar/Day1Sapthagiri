package Day11;
class Node1{
    int data;
    Node1 next;
    Node1(int data){
        this.data=data;
        this.next=null;
    }
}
public class SinglyLL2 {
    Node1 head=null;
    public void circularLL(int n){
        if(n<=0)return;
        head=new Node1(1);
        Node1 temp=head;
        for(int i=2;i<=n;i++){
            temp.next=new Node1(i);
            temp=temp.next;
        }
        temp.next=head;//make it circular Linked list
    }
    public void display(int n){
        Node1 temp=head;
        int count=0;
        while(temp!=null && count<n){
            System.out.print(temp.data+"->");
            temp=temp.next;
            count++;
        }
        System.out.println("Back to the Head");
    }
    public int josephus(int k){
        if(head==null||head.next==null)return -1;
        Node1 prev=null;
        Node1 curr=head;
        while(curr.next!=curr){
            for(int i=1;i<k;i++){
                prev=curr;
                curr=curr.next;
            }
            System.out.println("Eliminated :"+curr.data);
            prev.next=curr.next;
            curr=prev.next;
        }
        head=curr;
        return curr.data;
    }
    public static void main(String[] args) {
        SinglyLL2 list=new SinglyLL2();
        list.circularLL(7);
        list.display(7);
        int survivor=list.josephus(2);
        System.out.println("Thala for a Reason:"+survivor);

    }
}
