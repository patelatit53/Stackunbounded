package linkedlist;


public class Linkedlist {

   
    public static void main(String[] args) {
        LStack s1 = new LStack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.print();
        System.out.println("The value popped is = "+s1.pop());
        s1.print();
    }
    
}


*****************************
LStack
*****************************



class LStack {
    Node head;
    public void push(int v){
        head = new Node(v,head);
    }
    public int pop(){
        if(head==null) return -1;
        Node t = head;
        head = head.getNext();
        return t.getV();
    }
    public void print(){
        System.out.println("Printing LStack");
        Node t = head;
        while(t != null){
            System.out.println(t.getV());
            t = t.getNext();
        }
    }
}


*******************************
Node
*******************************



package linkedlist;


public class Node {
    private final int v;
    private final Node next;

    public Node(int v, Node next) {
        this.v = v;
        this.next = next;
    }

    public int getV() {
        return v;
    }

    public Node getNext() {
        return next;
    }  
}