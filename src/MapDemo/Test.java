//package MapDemo;
//
//
//class A {
//    int x = 10;
//    void show() {
//        System.out.println("A's show");
//    }
//}
//class B extends A {
//    int x = 20;
//    void show() {
//        System.out.println("B's show");
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        A obj = new B();
//        System.out.println(obj.x);
//        obj.show();
//    }

class A {
    A() {
        System.out.println("A's ");
    }
}

class B extends A {
    B() {
        System.out.println("B's ");
    }
}

class C extends B {
    C() {
        System.out.println("C's ");
    }
}
public class Test {
    public static void main(String[] args) {
        C obj = new C();
    }
}