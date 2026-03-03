package JavaTraining.module5;

//Write a program to illustrate deadlock concept (demonstration code).

public class Question7 {
    public static void main(String[] args) {
        final Object r1 = "Resource 1";
        final Object r2 = "Resource 2";
        new Thread(() -> {
            synchronized (r1) {
                System.out.println("T1: Locked R1");
                try { Thread.sleep(50); } catch (Exception e) {}
                synchronized (r2) { System.out.println("T1: Locked R2"); }
            }
        }).start();
        new Thread(() -> {
            synchronized (r2) {
                System.out.println("T2: Locked R2");
                try { Thread.sleep(50); } catch (Exception e) {}
                synchronized (r1) { System.out.println("T2: Locked R1"); }
            }
        }).start();
    }
}
