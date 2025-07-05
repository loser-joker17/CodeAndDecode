package Multithreading.MonitorLockExample;

public class MonitorLockExample {

    public synchronized void task1(){
        System.out.println("Do something in task1");
    }
    public void task2(){
        System.out.println("Do something in task2 before synchronized");
        synchronized (this){
            System.out.println("Do something in task2 inside synchronized");
        }
    }
    public void task3(){
        System.out.println("Do something in task3 without synchronized");
    }
}
