package Interview.Threading;


import java.util.concurrent.CountDownLatch;

/*
    CountDownLatch allows one more thread to wait until
     a sets of operation being performed in other threads completes
 */
public class CountDownLatchDemo {

    public static void main(String[] args) {

        CountDownLatch latch = new CountDownLatch(3);

        Runnable task = () -> {
            try {
                Thread.sleep(1000); // Simulate work
                System.out.println(Thread.currentThread().getName() + " completed.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                latch.countDown();
            }
        };

        for (int i = 0; i < 3; i++) {
            new Thread(task).start();
        }

        try {
            latch.await();
            System.out.println("All tasks completed. Main thread proceeding.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }
}
