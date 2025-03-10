package LIST.copyonWritearray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class Copydemo {
    public static void main(String[] args) {

        ArrayList<Integer> list1=new ArrayList<>();
        CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(10);
        list.add(19);
        list.add(20);
        list.add(122);

        for(int x:list)
        {

            if(x%2==0)
            {
                list.add(0);
            }
            System.out.println(x);
        }

        System.out.println(list);
/*

        list1.add(1);
        list1.add(10);
        list1.add(19);
        list1.add(20);
        list1.add(122);


        for(int x:list1)
        {

            if(x%2==0)
            {
                list1.add(0);
            }
            System.out.println(x);
        }

        System.out.println(list1);
        //when we try to do this with the help of arraylist it is showing error
        Exception in thread "main" java.util.ConcurrentModificationException
	    at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
	    at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
	     at LIST.copyonWritearray.Copydemo.main(Copydemo.java:37)


*/

    }
}
