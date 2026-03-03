package JavaTraining.module5;

//Write a program to demonstrate thread life cycle states.

import JavaTraining.module4.Question7;

public class Question8 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(500);

                synchronized (Question8.class) {
                    Question7.class.wait(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println("State after creation: " + t1.getState());

        t1.start();
        System.out.println("State after start(): " + t1.getState());

        Thread.sleep(100);
        System.out.println("State during sleep(): " + t1.getState());

        t1.join();

        System.out.println("State after completion: " + t1.getState());
    }
}
