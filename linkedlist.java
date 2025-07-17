class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LL{
    Node head=null;
    Node tail=null;
    int size=0;
    public void add(int data){
        Node newNode=new Node(data);
        if(size==0){
          head=tail=newNode;  
        }else{
            tail.next=newNode;
            tail=newNode;
        }
        size++;
    }
    void insertAtEnd(int data){
       Node newNode= new Node(data);
       if(size==0){
        head=tail=null;   
       }else{
           tail.next=newNode;
           tail=newNode; 
       }
       size++;
    }
    void insertAtAmy(int data,int idx){
        Node newNode=new Node(data);
        Node temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
    }
    void deleteHead(){
        head=head.next;
        size--;
    }
    void deleteTail(){
        Node temp=head;
        while(temp.next != tail){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        size--;
    }
    void deleteAny(int idx){
        Node temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
    }
    public void display(){
        Node temp=head;
        while(temp!= null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
public class linedlist{
    public static void main(String args[]){
        // Node n1=new Node(2);
        // Node n2=new Node(3);
        // Node n3=new Node(4);
        // Node n4=new Node(5);
        
        
        // n1.next=n2;
        // n2.next=n3;
        // n3.next=n4;
        // n4.next=null;
        
        // System.out.println(n2.next.data);
        
        
        
        
        LL list=new LL();
        // list.insert(new Node(1));
        // list.insert(new Node(2));
        // list.insert(new Node(3));
        // list.insert(new Node(4));
        
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        
        list.display();
        System.out.println();
        
        System.out.println("the size of the ll is: "+list.size+" and the haed is: "+list.head.data+" and the tail is: "+list.tail.data);
        
        list.insertAtEnd(5);
        list.display();
        System.out.println();
        System.out.println("the size of the ll is: "+list.size+" and the head is: "+list.head.data+" and the tail is: "+list.tail.data);

        list.insertAtAmy(7,3);
        list.display();
        System.out.println();
        System.out.println("the size of the ll is: "+list.size+" and the head is: "+list.head.data+" and the tail is: "+list.tail.data);

        System.out.println();
        
        
        list.deleteHead();
        list.display();
        System.out.println();
        System.out.println("the size of the ll is: "+list.size+" and the head is: "+list.head.data+" and the tail is: "+list.tail.data);

        list.deleteHead();
        list.display();
        System.out.println();
        System.out.println("the size of the ll is: "+list.size+" and the head is: "+list.head.data+" and the tail is: "+list.tail.data);


        list.deleteTail();
        list.display();
        System.out.println();
        System.out.println("the size of the ll is: "+list.size+" and the haed is: "+list.head.data+" and the tail is: "+list.tail.data);


        list.deleteAny(1);
        list.display();
        System.out.println();
        System.out.println("the size of the ll is: "+list.size+" and the haed is: "+list.head.data+" and the tail is: "+list.tail.data);

    }
}
