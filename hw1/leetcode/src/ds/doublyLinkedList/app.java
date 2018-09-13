package ds.doublyLinkedList;

public class app {

    public static void main(String[] args){
        DoublyLinkedList db = new DoublyLinkedList();
        db.insertFirst(22);
        db.insertFirst(44);
        db.insertFirst(66);
        db.displayforward();
        db.displaybackward();

        db.insertAfter(22,88);
        db.displayforward();
        db.displaybackward();
        db.insertAfter(22,99);
        db.displayforward();
        db.displaybackward();
    }


}
