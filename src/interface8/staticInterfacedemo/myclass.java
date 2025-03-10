package interface8.staticInterfacedemo;

public class myclass implements a {

    public static void main(String[] args) {
        myclass m =new myclass();
        a.sayHello();  //static interface method can be call like this only
        m.print();

    }
}
