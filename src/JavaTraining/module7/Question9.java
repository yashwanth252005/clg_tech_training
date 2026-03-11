package JavaTraining.module7;

//Identify whether a sorting algorithm is stable or unstable with examples.

import java.util.*;

class Student {
    String name;
    int grade;

    Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "(" + name + ", " + grade + ")";
    }
}

public class Question9 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Alice", 10),
                new Student("Bob", 10),
                new Student("Charlie", 9)
        ));

        System.out.println("Original (Sorted by Name): " + students);

        students.sort(Comparator.comparingInt(s -> s.grade));
        System.out.println("After Stable Sort (by Grade): " + students);

        // 2. UNSTABLE SORT Note:
        // Algorithms like QuickSort or Selection Sort are UNSTABLE.
        // If we used a standard QuickSort here, Bob(10) could end up before Alice(10).
    }
}
