package ds.queue;

public class Queue {

    private int maxSize; //maintains the set number of slots
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size){
        this.maxSize = size;
        this.queArray = new long[size];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long j){
        if (rear==maxSize-1){
            rear = -1;
        }
        queArray[++rear] = j;
        nItems ++;
    }

    public void view(){
        System.out.print("[");
        for (int i = 0; i<queArray.length;i++){
            System.out.print(queArray[i]+",");
        }
        System.out.print("]");
    }

    public long remove(){
        long temp = queArray[front++];
        nItems --;
        if (front==maxSize) front=0;
        return temp;
    }

    public long peek(){
        return queArray[front];
    }

    public boolean isEmpty(){
        return nItems==0;
    }

    public boolean isFull(){
        return nItems==maxSize;
    }
}
