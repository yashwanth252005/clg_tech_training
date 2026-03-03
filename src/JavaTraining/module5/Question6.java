package JavaTraining.module5;

//Demonstrate synchronization using two threads accessing a shared counter.

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class Question6 {
    public static void main(String[] args) throws InterruptedException {
        Counter sharedCounter = new Counter();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                sharedCounter.increment();
            }
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final Count: " + sharedCounter.getCount());
    }
}
