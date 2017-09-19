package com.company;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.lang.InterruptedException;


public class View {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        Integer numThreads = Integer.parseInt(args[0]);
        System.out.println("Number of threads = " + numThreads);

        //creates the number of threads requested
        ExecutorService threads = Executors.newFixedThreadPool(numThreads);
        //Start Threads and counters
        for(int i =0; i<numThreads; i++){

            threads.execute(new Task(counter));
        }
        Long start = System.currentTimeMillis();

        threads.shutdown();
        threads.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);

        Long finish = System.currentTimeMillis();

        System.out.println("Time in Milliseconds: " + (finish - start));
            System.out.println("Counter = " + counter.getCounter());

    }
}
