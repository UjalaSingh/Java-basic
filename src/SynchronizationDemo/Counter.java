package SynchronizationDemo;
public class Counter {

    private int count=0;
   public  synchronized void increment()    //if we not synchronised keyword then ans can be anything but now one will access then other wioll aceess
   {
       count++;
   }

   public int getCount()
   {
       return count;
   }
}
