package adt;

import java.util.LinkedList;

public class app {

    public static void main(String[] args) {
        counter co = new counter("counter");
        co.increment();
        co.increment();
        System.out.println(co.toString());

        LinkedList mylist = new LinkedList();
    }
}
