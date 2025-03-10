package MapDemo.Hashmap;

import java.util.HashMap;

public class HashCodeAndEquals {
    public static void main(String[] args) {
        HashMap<student,String> m=new HashMap<>();
        student s1=new student(1,"ajay");
        student s2=new student(22,"babu");
        student s3=new student(1,"ajay");

        m.put(s1,"ENGINEER");
        m.put(s2,"DOCTOR");
        m.put(s3,"uska mnn");

        System.out.println("s1:"+m.get(s1));
        System.out.println("s3: "+m.get(s3));
        System.out.println(s1);   //it will print string something

    }
}
