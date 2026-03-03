package JavaTraining.module4;

//Write a program to demonstrate static variables and static methods.

class Student {
    static String schoolName = "Global High School";

    String studentName;

    public Student(String name) {
        this.studentName = name;
    }

    static void changeSchool(String newName) {
        schoolName = newName;
    }

    void display() {
        System.out.println("Student: " + studentName + " | School: " + schoolName);
    }
}

public class Question6 {
    public static void main(String[] args) {
        System.out.println("Initial School: " + Student.schoolName);

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        s1.display();
        s2.display();

        System.out.println("\n Updating school for everyone ");
        Student.changeSchool("Tech Academy");

        s1.display();
        s2.display();
    }
}

