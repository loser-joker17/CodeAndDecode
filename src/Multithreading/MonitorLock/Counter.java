package Multithreading.MonitorLock;

public class Counter {
    private int count=0;

    public synchronized void increament(){ //agr mein lock nhi krunga mtlb synchronized nhi laguange
                                          // toh hum pta hi nhi kr payenge ki knsi thread calll ho rhi ulti seedhi value print krega
        count++;
    }

    public int getCount() {
        return count;
    }
}
