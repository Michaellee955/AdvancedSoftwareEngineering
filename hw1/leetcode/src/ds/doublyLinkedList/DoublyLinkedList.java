package ds.doublyLinkedList;

public class DoublyLinkedList {

    private Node first;
    private Node last;

    public DoublyLinkedList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public void insertFirst(int val){
        Node newNode = new Node();
        newNode.val = val;

        if (isEmpty()){
            last = newNode;
        }else{
            first.prev = newNode;
        }

        newNode.next = first;
        this.first = newNode;
    }

    public void insertLast(int val){
        System.out.println("i am here");
        Node newNode = new Node();
        newNode.val = val;
        last.next = newNode;
        newNode.prev = last;
        this.last = newNode;

        if (first==null){
            first = newNode;
        }
    }

    public Node deleteFirst(){
        Node temp = first;
        first.next.prev = null;
        first = first.next;

        if (first==null) last=null;

        return temp;
    }

    public Node deleteLast(){
        Node temp = last;
        last.prev.next = null;
        last = last.prev;

        if(last==null) first=null;

        return temp;
    }

    public boolean insertAfter(int key, int val){
       Node cur = first;
       while(cur.val!=key){
           cur = cur.next;
           if (cur==null)
               return false;
       }

       Node newNode = new Node();
       newNode.val = val;
       if (cur==last){
           insertLast(val);
       }else{
           System.out.println("I AM HERE");
           newNode.next = cur.next;
           newNode.prev = cur;

           cur.next = newNode;
           newNode.next.prev = newNode;
       }


       return true;
    }

    public Node deletekey(int key){
        Node cur = first;
        while(cur.val!=key){
            cur = cur.next;
            if (cur==null)
                throw new IllegalArgumentException("can't find such a key node");
        }
        Node temp = cur;
        cur.prev.next = cur.next;
        cur.next.prev = cur.prev;
        cur.next = null;
        cur.prev = null;

        return temp;
    }

    public void displayforward(){
        System.out.println("List (first --> last)");
        Node cur = first;
        while (cur!=null){
            cur.displayNode();
            cur = cur.next;
        }
        System.out.println("---------------");
    }

    public void displaybackward(){
        System.out.println("List (last --> first)");
        Node cur = last;
        while (cur!=null){
            cur.displayNode();
            cur = cur.prev;
        }
        System.out.println("---------------");
    }


}
