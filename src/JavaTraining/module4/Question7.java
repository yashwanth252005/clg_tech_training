package JavaTraining.module4;

//Write a short program to demonstrate Garbage Collection using System.gc()

public class Question7 {

    @Override
    protected void finalize() {
        System.out.println("Garbage collector is cleaning up this object!");
    }

    public static void main(String[] args) {
        Question7 obj1 = new Question7();
        Question7 obj2 = new Question7();
        obj1 = null;
        obj2 = null;

        System.out.println("Objects are now null. Requesting Garbage Collection...");

        System.gc();
    }
}

