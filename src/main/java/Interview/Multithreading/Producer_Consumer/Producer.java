package Interview.Multithreading.Producer_Consumer;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

    private BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> queue){

        this.queue = queue;
    }
    @Override
    public void run() {

        for(int i = 0; i< 10; i++){
            try {

                System.out.println("Produced"+ i );
                queue.put(i);

            }catch (InterruptedException e){

                Thread.currentThread().interrupt();
            }
        }

    }
}


