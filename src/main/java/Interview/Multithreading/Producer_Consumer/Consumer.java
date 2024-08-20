package Interview.Multithreading.Producer_Consumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue){
        this.queue = queue;
    }


    @Override
    public void run() {

        while (true){

            try {
                Integer value = queue.take();
                System.out.println("Consumed: " + value);
            }catch (InterruptedException e){

                Thread.currentThread().interrupt();
                break;
            }
        }

    }


    public static void main(String[] args) {

        BlockingQueue<Integer> queue1 = new ArrayBlockingQueue<>(20);
        Thread producerThread = new Thread(new Producer(queue1));
        Thread consumerThread = new Thread(new Consumer(queue1));

        producerThread.start();
        consumerThread.start();

        System.out.println("Executed");
    }
}
