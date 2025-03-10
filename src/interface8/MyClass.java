package interface8;

public class MyClass implements A,B {
    public static void main(String[] args) {
       MyClass myClass=new MyClass();
       myClass.print();

    }
    @Override
    public void print() {
        B.super.print();
    }
}
