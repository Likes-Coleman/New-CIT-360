
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Threads {

    // This program starts three threads and executes them in two pools.
    public static boolean cthread;
    public static String threadProcess = " initializing";

    public static void main(String args[]) {

        // Creates the three runnable threads.
        Thread t1 = new Thread(new RunnableProcess("thread-1"));
        Thread t2 = new Thread(new RunnableProcess("thread-2"));
        Thread t3 = new Thread(new RunnableProcess("thread-3"));

        // Assigns a name for each numbered thread.
        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        // Initializes the three threads.
        t1.start();
        t2.start();
        t3.start();

        /*
         * The executor framework separates the task creation and execution. a different
         * method of executing the threads simulatenously.
         */
        ExecutorService executeThread = Executors.newCachedThreadPool();
        ThreadPoolExecutor executorPool = (ThreadPoolExecutor) executeThread;

        // Gives the name of the runnable process.
        executeThread.submit(new RunnableProcess("pool-1"));
        executeThread.submit(new RunnableProcess("pool-2"));

        // Displays the size of the pool.
        System.out.println("size of pool: " + executorPool.getPoolSize());

        // Shuts down the shutdown.
        executeThread.shutdown();
    }

    /*
     * Prints information about the current thread and the index it is on within the
     * RunnableProcess
     */
    public static void printFor(int index) {
        StringBuffer sb = new StringBuffer();
        sb.append(Thread.currentThread().getName()).append(threadProcess);
        sb.append(" for the ").append(index).append(" time. \n");
        System.out.print(sb.toString());
    }
}

// Implements thread runnables.
class RunnableProcess implements Runnable {
    private String name;

    public RunnableProcess(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i < 4; i++) {
            synchronized (Threads.threadProcess) {
                Threads.printFor(i);
                System.out.printf("%s is done. \n", this.name);
                System.out.print("\n");

                // Will catch any interrupted threads.
                try {
                    Threads.threadProcess.notifyAll();
                    Threads.threadProcess.wait();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}