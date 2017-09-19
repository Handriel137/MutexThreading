package com.company;

public class Counter {

    private int counter = 0;

    public Counter() {}

    public int getCounter() {
        return counter;
    }

    //volatile increment
    void increment() {this.counter++;}

    //safe increment
    synchronized void MutexIncrement() {this.counter++;}
}
