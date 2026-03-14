package Day10;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SinglyLL {
   static Node head=null;
    public void addFirst(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void addAtPosition(int data,int position){
        Node newNode=new Node(data);
        if(position==1){
            addFirst(data);
            return;
        }
        Node temp=head;
        for(int i=1;i<position-1&& temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Position out of Range");
            return;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public int countNodes(){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public void reverse(){
        Node prev=null;
        Node current=head;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }
    public boolean isCyclic(){
        Node slow=head;
        Node fast=head;
        while(fast!=null&& fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public void swapNodes(int x,int y){
        if(x==y){
            System.out.println("Both nodes are equal no need to swap");
            return;
        }
        //to Search X
        Node prevX=null,currX=head;
        while(currX!=null && currX.data!=x){
            prevX=currX;
            currX=currX.next;
        }
        //To search Y
        Node prevY=null,currY=head;
        while(currY!=null && currY.data!=y){
            prevY=currY;
            currY=currY.next;
        }
        if(currX==null||currY==null){
            System.out.println("One or both nodes are not found");
            return;
        }
        if(prevX!=null){
            prevX.next=currY;
        }
        else{
            head =currY;
        }
        if(prevY!=null){
            prevY.next=currX;
        }
        else{
            head=currX;
        }
        Node temp=currX.next;
        currX.next=currY.next;
        currY.next=temp;
    }
    public int findMiddle(){
        if(head==null)return -1;
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
    public void splitList(){
        if(head==null||head.next==null){
            System.out.println("List is too small to split");
            return;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null&& fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node head1=head;
        Node head2=slow.next;
        if(slow!=null){
            slow.next=null;
        }
        System.out.println("First Half");
        SinglyLL firstHalf=new SinglyLL() ;
        firstHalf.head=head1;
        firstHalf.display();

        System.out.println("Second Half");
        SinglyLL secondHalf=new SinglyLL() ;
        firstHalf.head=head2;
        firstHalf.display();
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
    }
    public void deleteLast(){
        if(head==null) {
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public void deletePosition(int position){
        if(head==null) {
            System.out.println("List is empty");
            return;
        }
        if(position<=0){
            System.out.println("Invalid Position");
            return;
        }
        if(position==1){
            deleteFirst();
            return;
        }
        Node temp=head;
        for(int i=1;i<position-1 && temp!=null;i++)
        {
            temp=temp.next;
        }
        if(temp==null||temp.next==null){
            System.out.println("Position Out of Bounds");
            return;
        }
        temp.next=temp.next.next;
    }
    public static void main(String[] args) {
        SinglyLL list=new SinglyLL();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
//        list.display();
//        list.addFirst(60);
//        list.display();
//        list.addAtPosition(70,3);
//        list.display();
//        System.out.println("Thala :"+ list.countNodes());
//        list.reverse();
        //list.display();
        //manually create a cycle
        //list.head.next.next.next.next.next=list.head.next;
        //System.out.println(list.isCyclic());
        //list.swapNodes(20,40);
        //System.out.println("After Swapping");
        //list.display();
        //System.out.println("Middle of Linked list ->" +list.findMiddle());
        //list.splitList();
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.deletePosition(2);
        list.display();
    }
}
