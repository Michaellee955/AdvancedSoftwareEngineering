package adt;

public class counter {
    String name = null;
    int val = 0;

    public counter(String str){
        this.name = str;
    }

    public void increment(){
        val ++;
    }

    public int grtCurrentValue(){
        return val;
    }

    @Override
    public String toString(){
        return name + ": " + val;
    }
}
