package LIST.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class arr {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        List<Integer> list=new ArrayList<>(size);
        for(int i=0;i<size;i++)
        {
            list.add(s.nextInt());
            System.out.println(list.get(i));
        }

//        System.out.println(list.contains(8));
//        list.add(2,8);
        System.out.println(list.contains(8));
        Collections.sort(list);
        System.out.println(list);

    }
}
