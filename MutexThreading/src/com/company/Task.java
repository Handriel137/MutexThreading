package com.company;

public class Task implements Runnable{

    private Counter counter;

    public Task(Counter counter)
    {
        //takes the global counter and creates a local counter with its value
        this.counter = counter;
    }

        public void run(){

        //increments 1 million times
            for(int i =0; i<1000000; i++)
            {
                //this.counter.increment();
                this.counter.MutexIncrement();
            }
        }

}
