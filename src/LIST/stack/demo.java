package LIST.stack;

import java.util.Stack;

public class demo {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(10);
        s.push(11);
        s.push(111);
        s.push(19);
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.add(78));
        System.out.println(s);

    }
}

