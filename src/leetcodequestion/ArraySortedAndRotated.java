package leetcodequestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraySortedAndRotated {
    public static void main(String[] args) {
        List<Integer> array=new ArrayList<>();

        Scanner scanner=new Scanner(System.in);
        Integer size=scanner.nextInt();

        for(int i=0;i<size;i++)
        {
            //int temp;
            array.add(scanner.nextInt());
        }

        System.out.println("array is sorted and roatated :"+  checkIfSortedAndRoatated(array));
    }

    public static boolean checkIfSortedAndRoatated( List<Integer> array)
    {
        int count=0;

        for(int i=1;i<array.size();i++)
        {
            if(array.get(i-1) > array.get(i))
            {
                count++;
            }

        }
        if(array.get(array.size()-1) > array.get(0))
            count++;

        if(count<=1)
            return true;

         return  false;
    }
}
