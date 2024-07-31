package Interview.Threading;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3,
                () -> System.out.println("All threads reached the barrier. Proceeding..."));

        Runnable task = () -> {

            try {

                System.out.println(Thread.currentThread().getName() + " waiting at the barrier.");
                cyclicBarrier.await();
                System.out.println(Thread.currentThread().getName() + " passed the barrier.");

            } catch (InterruptedException | BrokenBarrierException e) {
                Thread.currentThread().interrupt();
            }
        };

        for(int i =0; i<3; i++)
        {
            new Thread(task).start();
        }
    }
}
