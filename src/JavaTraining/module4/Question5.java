package JavaTraining.module4;

//Demonstrate the use of final keyword with variables, methods, and classes.

// 1. FINAL CLASS: Nobody can extend (inherit) this class
final class SecretCode {
    void show() {
        System.out.println("This class is final. No one can inherit from it!");
    }
}

class Parent {
    // 2. FINAL VARIABLE: This value is locked
    final int speedLimit = 60;

    // 3. FINAL METHOD: Subclasses can use it, but cannot CHANGE it
    final void rules() {
        System.out.println("This is a final method. You cannot override it!");
    }
}

class Child extends Parent {
    void display() {
        // speedLimit = 80; // This would cause an ERROR if uncommented
        System.out.println("The speed limit is: " + speedLimit);
    }

    /*
    void rules() {
        System.out.println("Trying to change rules...");
    } // This would cause an ERROR because rules() is final in Parent
    */
}

public class Question5 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
        obj.rules();

        SecretCode sc = new SecretCode();
        sc.show();
    }
}
