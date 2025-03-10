package MapDemo.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Linkedhashdemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> map=new LinkedHashMap<>(11,0.5f,true);
        map.put(1,"ujala");
        map.put(19,"riya");
        map.put(11,"ram");
        map.put(10,"ajay"); //replace the value ujala to ajay in normal but in case of object we have do chnages
        map.get(19);
        map.get(1);

        map.get(11);
        map.get(10);
        for(Map.Entry<Integer, String> entry:map.entrySet())
        {
            System.out.println(entry.getValue() + " :"+entry.getKey());
        }
    }
}
