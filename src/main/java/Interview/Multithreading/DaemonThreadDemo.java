package Interview.Multithreading;

public class DaemonThreadDemo {

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {


                    try {
                    Thread.sleep(5000);
                    System.out.println(" User thread is finished ..");

                }catch(Exception e){
                    e.printStackTrace();
                }
        });

        Thread daemonThread = new Thread(() -> {

            while (true) {
                try {
                    Thread.sleep(5000);
                    System.out.println(" Daemon thread is finished ..");

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        daemonThread.setDaemon(true);
        thread.start();
        daemonThread.start();

        System.out.println(" Main thread is finished ..");
    }
}
