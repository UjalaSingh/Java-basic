package LIST.Linkedlist;

import java.util.LinkedList;

public class First {

    public static void main(String [] args)
    {
        LinkedList<Integer>  list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.addFirst(0);
        list.addLast(10);
        System.out.println(list);

        list.removeIf(x->x%2!=0);
        System.out.println(list);
    }
}
