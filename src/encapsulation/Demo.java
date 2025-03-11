package encapsulation;

public class Demo {


    private int age;
    private String name;

    public Demo(int age,String name)
    {
        this.age=age;
        this.name=name;
    }

    public void print() {
        System.out.println(this.age);
        System.out.println(this.name);
    }
}
