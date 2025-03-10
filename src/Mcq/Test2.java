package Mcq;

class Parent {
    int x = 10;

    void show() {
        System.out.println("Parent's show");
    }
}

class Child extends Parent {
    int x = 20;

    void show() {
        System.out.println("Child's show");
    }

    void display() {
        System.out.println(super.x); // Line 1
        super.show();         // Line 2
    }
}

public class Test2 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
