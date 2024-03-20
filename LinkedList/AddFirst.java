package LinkedList;

public class AddFirst {
    //creating a single node 
    public static class Node {
        int data;
        Node next;

        //constructor
        public Node(int data){
            this.data = data;   //value of data is data
            this.next = null;   //value of next is null
        }
    }

    public static Node head;
    public static Node tail;


    public void addFirst(int data){
        //step 1- create node(newNode)
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
        }

        //step 2
        newNode.next = head;

        //step 3
        head = newNode;
    }

    

    public static void main(String[] args){

        //creating LinkedList using main class name
        AddFirst ll = new AddFirst();
        ll.addFirst(2);
        ll.addFirst(1);
    }
}
