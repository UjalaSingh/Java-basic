package MapDemo.Hashmap;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class MapdemoPractice {

    public static void main(String[] args) {

        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"ujala");
        map.put(19,"riya");
        map.put(11,"ram");
        map.put(20,"ajay");
        System.out.println(map);
        System.out.println(map.get(19));
        System.out.println(map.get(190));
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("ujaaa"));

          Set<Integer> s=map.keySet();
//          for (int keys:s)
//          {
//              System.out.println(map.get(keys));
//          }
          Set<Map.Entry<Integer,String >> entries= map.entrySet();
           for(Map.Entry<Integer, String> entry:entries)
           {
               System.out.print(entry.getKey()+":");
               System.out.println(entry.getValue().toUpperCase(Locale.ROOT));
           }

    }
}
