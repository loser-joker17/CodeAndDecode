package Multithreading.ConsumerAndProducer;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResourcesBuffer {

    private Queue<Integer> queue = new LinkedList<>();

    private final int CAPACITY = 5;

    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size() == CAPACITY) {
            System.out.println("Buffer full. Producer waiting...");
            wait();
        }
        queue.add(value);
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized void consume() throws InterruptedException {
        while (queue.isEmpty()){
            System.out.println("Buffer empty. Consumer waiting...");
            wait();
        }

        int value=queue.poll();
        System.out.println("Consume: " + value);
        notify();
    }

}
