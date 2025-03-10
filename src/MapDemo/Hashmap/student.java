package MapDemo.Hashmap;

import java.util.Objects;

public class student{


    int roll;
    String name;
    student(int roll,String name)
    {
        this.name=name;
        this.roll=roll;
    }
    @Override
    public int hashCode() {
        return Objects.hash(roll,name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // Same reference check
        if (obj == null || getClass() != obj.getClass()) return false;
        student emp = (student) obj;
        return roll == emp.roll && Objects.equals(name, emp.name);
    }

    @Override
    public String toString() {
        return "id :" + roll + " name :" +name;
    }

}