package interface8.staticInterfacedemo;

public interface a {

    static void sayHello()
    {
        System.out.println("hello ji");
    }
    default void print()
    {
        System.out.println("b says hello");
    }
}
