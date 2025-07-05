package Multithreading.MonitorLockExample;

public class MainClient {

    public static void main(String args[]) throws InterruptedException {
      MonitorLockExample monitorObj = new MonitorLockExample();   // monitorObj ek hi object hai sab thread ke liye  yahi shared resource hai

      Thread thread1 = new Thread(() -> {monitorObj.task1();});
      Thread thread2 = new Thread(() -> {monitorObj.task2();});
      Thread thread3 = new Thread(() -> {monitorObj.task3();});

      thread1.start();
      thread2.start();
      thread3.start();

//      thread1.join();
//      thread2.join();
//      thread3.join();
//
//      System.out.println("All threads completed. Main thread exiting.");  play with these thing join lagane se saari process complete hogi
    }
}
