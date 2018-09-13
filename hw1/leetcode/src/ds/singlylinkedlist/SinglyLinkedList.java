package ds.singlylinkedlist;

public class SinglyLinkedList {
    private Node first;
    private Node last;

    public SinglyLinkedList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.val = data;
        newNode.next = first;
        first = newNode;
        if (last==null){
            last = first;
        }
    }

    public Node deleteFirst(){
        Node temp = first;
        first = first.next;
        temp.next = null;

        if (first==null) last=null;
        return temp;
    }

    public void displayList(){
        System.out.println("List (first -> last)");
        Node current = first;
        while(current != null){
            current.displayNode();
            current = current.next;
        }
    }

    public void insertLast(int data){
        Node newNode = new Node();
        newNode.val = data;

        if(isEmpty()) insertFirst(data);
        else {
            last.next = newNode;
            last = newNode;
        }
    }


}
