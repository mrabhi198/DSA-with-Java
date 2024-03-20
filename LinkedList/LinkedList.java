package LinkedList;

public class LinkedList {
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
        //step 1 - create new node 
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
        }

        //step 2 
        newNode.next = head;

        //step 3
        head = newNode;

    }

    public void addLast(int data){
        //step 1
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
        }

        //step 2
        tail.next = newNode;

        //step 3
        tail = newNode;
    }

    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
    }
}
