import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        Iterator<Integer>iterator=stack.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+"\t");
        }
    }
}
