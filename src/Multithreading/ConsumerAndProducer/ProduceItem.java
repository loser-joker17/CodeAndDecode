package Multithreading.ConsumerAndProducer;

public class ProduceItem extends Thread{

    private SharedResourcesBuffer buffer;

    public ProduceItem(SharedResourcesBuffer buffer){
        this.buffer=buffer;
    }
    public void run() {
        int value = 0;
        try {
            while (true) {
                buffer.produce(value);
                value++;
                Thread.sleep(500); // Simulate some delay
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
