package collections.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
//        Stack<Integer> inStack = new Stack<>(3); --> it doesn`t allow specify initial capacity
        Stack<Integer> inStack = new Stack<>();
        Integer res = inStack.push(1);
        System.out.println(res);
        inStack.push(2);
        inStack.push(3);
        inStack.push(4);
        inStack.push(5);

        System.out.println(inStack.size()); //5

        Integer v = inStack.pop();
        System.out.println(v);

        Integer r = inStack.peek();
        System.out.println(r);

        System.out.println(inStack.isEmpty());//false

    }
}
