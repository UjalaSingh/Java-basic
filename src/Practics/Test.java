package Practics;
public class Test {

    public static  void main(String [] args)
    {
        Animal c=new Cat();
       c.setName("hell");
        System.out.println(c.getName());
        c.setAge(18);
        System.out.println(c.getAge());
        c.hello();

        Animal a=new Animal();
        a.hello();



    }
}
