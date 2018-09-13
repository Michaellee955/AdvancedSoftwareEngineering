package ds.stack;

public class Stack {

    private int maxSize;
    private long[] stackArray;
    private int top;

    public Stack(int size){
        this.maxSize = size;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }


    private void doubleStack(){
        long[] new_st = new long[2*maxSize];
        for (int i=0;i<maxSize;i++){
            new_st[i] = stackArray[i];
        }
        stackArray = new_st;
    }
    public void push(long j){
        if(isFull()){
            doubleStack();
        }
        top ++;
        stackArray[top] = j;
    }

    public long pop(){
        return stackArray[top--];
    }

    public long peak(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
        return maxSize-1==top;
    }
}
