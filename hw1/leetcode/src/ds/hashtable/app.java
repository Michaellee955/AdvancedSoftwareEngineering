package ds.hashtable;

public class app {

    public static void main(String[] args){
        HashTable table = new HashTable((19));
        table.insert("Apple");
        table.insert("Hello");
        table.insert("Feeling");

        System.out.println(table.find("Applq"));
    }


}
