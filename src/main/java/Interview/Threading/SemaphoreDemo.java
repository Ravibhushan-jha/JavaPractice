package Interview.Threading;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {

    public static void main(String[] args) {

        //Semaphore control the access permit of thread
        //it have set of permit which mangers acquired and released by thread

        Semaphore semaphore = new Semaphore(4);

        Runnable task = () -> {
            try {
                semaphore.acquire();
                System.out.println(Thread.currentThread().getName()+ " This thread acquired permit");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }finally {
                System.out.println(Thread.currentThread().getName()+ " This thread released permit");
                semaphore.release();
            }

        };

        for (int i = 0; i <6 ; i++){
            new Thread(task).start();
        }
    }
}
