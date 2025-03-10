package MapDemo.Identityhash;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        String s1=new String("key");
        String s2=new String("key");
     //    HashMap<String ,Integer> m=new HashMap<>();
        Map<String ,Integer> m=new IdentityHashMap<>();
        m.put(s1,1);
        m.put(s2,2);
        System.out.println(m);



    }
}
