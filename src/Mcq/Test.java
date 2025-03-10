package Mcq;

class Test {
    int x = 5;
    Test() {
        this(10);
        System.out.println("Default");
    }
    Test(int x) {
        this.x = x;
        System.out.println("Parameterized");
    }
    void display() {
        System.out.println("Value = " + this.x);
    }
    public static void main(String[] args) {
        Test obj = new Test();
        obj.display();
    }
}
