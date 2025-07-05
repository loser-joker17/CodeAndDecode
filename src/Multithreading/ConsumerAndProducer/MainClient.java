package Multithreading.ConsumerAndProducer;

public class MainClient {

    public static void main(String args[]){
        SharedResourcesBuffer buffer = new SharedResourcesBuffer();

        ProduceItem produceItem = new ProduceItem(buffer);
        ConsumeItem consumeItem = new ConsumeItem(buffer);

        produceItem.start();
        consumeItem.start();
    }
}
