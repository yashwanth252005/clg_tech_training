package JavaTraining.module4;

//Write a program to demonstrate the difference between String, StringBuilder, and
//StringBuffer.

public class Question3 {
    public static void main(String[] args) {
        String s = "Hello";
        s.concat(" World");
        System.out.println("String: " + s);

        StringBuilder sbuild = new StringBuilder("Hello");
        sbuild.append(" World");
        System.out.println("StringBuilder: " + sbuild);

        StringBuffer sbuff = new StringBuffer("Hello");
        sbuff.append(" World");
        System.out.println("StringBuffer: " + sbuff);

        long startTime = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("Java");
        for (int i = 0; i < 100000; i++) {
            buffer.append(" Code");
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("Java");
        for (int i = 0; i < 100000; i++) {
            builder.append(" Code");
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}

