package JavaTraining.module5;

//Create a thread using Thread class and another using Runnable interface. Compare
//both approaches.

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread started by extending Thread class.");
    }
}
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread started by implementing Runnable interface.");
    }
}

public class Question5 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        MyRunnable myRunnable = new MyRunnable();
        Thread t2 = new Thread(myRunnable);
        t2.start();
    }
}

