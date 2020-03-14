
/*import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;*/

public class Threads {
    public static boolean cthread;
    public static String threadProcess = " initializing";

    public static void main(String args[]) {

        //Runnable runnableTask = () -> {
        // Creates the three runnable threads.
        Thread t1 = new Thread(new RunnableProcess());
        Thread t2 = new Thread(new RunnableProcess());
        Thread t3 = new Thread(new RunnableProcess());
        // Assigns a name for each numbered thread.
        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        // Initializes the three threads.
        t1.start();
        t2.start();
        t3.start();
    //};
}
/*
    ExecutorService executor = Executors.newFixedThreadPool(1);
    List<Future<String>> results = executor.invokeAll(tasksList);
*/
    /*
     * Prints information about the current thread and the index it is
     * on within the RunnableProcess
     */
    public static void printFor(int index) {
        StringBuffer sb = new StringBuffer();
        sb.append(Thread.currentThread().getName()).append(threadProcess);
        sb.append(" for the ").append(index).append(" time. \n");
        System.out.print(sb.toString());
    }
}

// Implements thread runnables
class RunnableProcess implements Runnable {
    public void run() {
        for(int i = 1; i < 4; i++) {
            synchronized(Threads.threadProcess) {
                Threads.printFor(i);

                // Will catch any interrupted threads.
                try {
                    Threads.threadProcess.notifyAll();
                    Threads.threadProcess.wait();
                } catch(InterruptedException ex) {
                   ex.printStackTrace();
                }
            }
        }
    }
}