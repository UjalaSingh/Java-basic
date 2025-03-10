package abstraction.protectedExample;

public class Animal {
    int age;
    String Name;

   protected int h;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }


    protected static void sound(String val)
    {
        System.out.println(val);
    }

}

