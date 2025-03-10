package LIST.Array;

import java.util.ArrayList;
import java.util.List;

public class Valueof {

    public static void main(String[] args) {
        List<String > l1=new ArrayList<>();
        l1.add("apple");
        l1.add("orange");
        l1.add("apple");
        l1.add("mango");

        l1.remove("apple");   //this is used to remove object
        l1.remove(1);     //for index value
        for(String x:l1)
        {
            System.out.println(x);
        }

        ArrayList<Integer> l2=new ArrayList<>();
        l2.add(2);
        l2.add(3);
        l2.add(22);
        l2.add(2);

       // l2.remove(2);
        l2.remove(Integer.valueOf(22));

        for(int x:l2)
        {
            System.out.println(x);
        }
    }
}
