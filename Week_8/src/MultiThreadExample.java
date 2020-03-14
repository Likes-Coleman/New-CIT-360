public class MultiThreadExample {
    public static boolean cthread;
    public static String stuff = " printing material";

    public static void main(String args[]) {
        Thread t1 = new Thread(new RunnableProcess());
        Thread t2 = new Thread(new RunnableProcess());
        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t2.start();
        t1.start();
    }
    /*
     * Prints information about the current thread and the index it is
     * on within the RunnableProcess
     */
    public static void printFor(int index) {
        StringBuffer sb = new StringBuffer();
        sb.append(Thread.currentThread().getName()).append(stuff);
        sb.append(" for the ").append(index).append(" time.");
        System.out.print(sb.toString());
    }
}

// Runnable process
class RunnableProcess implements Runnable {
    public void run() {
        for(int i = 0; i < 10; i++) {
            synchronized(MultiThreadExample.stuff) {
                MultiThreadExample.printFor(i);
                try {
               	    MultiThreadExample.stuff.notifyAll();
                    MultiThreadExample.stuff.wait();
                } catch(InterruptedException ex) {
                   ex.printStackTrace();
                }
            }
        }
    }
}