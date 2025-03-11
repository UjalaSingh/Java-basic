package StringDemo;

import java.util.Locale;

public class StringDemoo {
    public static void main(String[] args) {

        String a="hello";
        String b="hello";
        System.out.println(a==b);    // literal values are allow to check with "=="

        String aa=new String("hello");
        String ab=new String("hello");
    //     System.out.println(ab==aa);                       can't check reference variable with == we have to use .equals to method
      //  System.out.println("exm" +  aa.equals(ab));    if we try to change string new refernce get created
//
//        String s="hello"+ ab;
//        System.out.println(s);
//        System.out.println(ab);


        String sub="hello world";
        System.out.println("substring :" + sub.toUpperCase(Locale.ROOT));
        System.out.println(sub.charAt(2));

     }
}
