package Multithreading.ConsumerAndProducer;

public class ConsumeItem extends Thread {
    private SharedResourcesBuffer buffer;

    public ConsumeItem(SharedResourcesBuffer buffer){
        this.buffer=buffer;
    }

    public void run() {
        try {
            while (true) {
                buffer.consume();
                Thread.sleep(1000); // Simulate some delay
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
