package MapDemo.Hashmap;

import java.util.HashMap;

public class Withoutobj {

    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"ujala");
        map.put(19,"riya");
        map.put(11,"ram");
        map.put(1,"ajay"); //replace the value ujala to ajay in normal but in case of object we have do chnages

        System.out.println(map);


    }
}
