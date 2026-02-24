package JavaTraining.module2;

//Write a program that uses a default constructor and a parameterized constructor to initialize objects of a class Student.

class Student {
    String name;
    int rollNumber;

    public Student() {
        this.name = "Unknown";
        this.rollNumber = 0;
    }

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void display() {
        System.out.println("Student Name: " + name  + "\n" + "Roll Number: " + rollNumber + "\n");
    }
}

public class Question4 {
    static void main() {
        Student s1 = new Student();
        Student s2 = new Student("Rahul", 101);

        System.out.print("S1 data: ");
        s1.display();

        System.out.print("S2 data: ");
        s2.display();
    }
}
