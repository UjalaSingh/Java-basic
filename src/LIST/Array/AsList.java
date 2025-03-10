package LIST.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AsList {
    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(1,2,993,4,333);
        // list1.add(2,22);     cann't add new element only replace it
        list1.set(2,90);
        for(int x:list1)
        {
            System.out.println(x);
        }
        Collections.sort(list1);
        for(int x:list1)
        {
            System.out.print(x + " ");
        }


    }
}
