package Multithreading.MonitorLock;

public class LockExample {
    public static void main(String args[]) throws InterruptedException {
        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                counter.increament();
            }
        });
        Thread thread2 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                counter.increament();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();  // Main thread waits for Thread-1 to finish
        thread2.join();  // Main thread waits for Thread-2 to finish

        System.out.println("Final Count: " + counter.getCount());
    }
}
