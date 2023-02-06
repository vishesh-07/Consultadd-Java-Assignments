import java.util.ArrayDeque;

public class JavaDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer>arrayDeque=new ArrayDeque<>();
        arrayDeque.add(4);
        arrayDeque.add(1);
        arrayDeque.add(5);
        System.out.println(arrayDeque);
        arrayDeque.addFirst(3);
        arrayDeque.addFirst(20);
        System.out.println(arrayDeque);
        arrayDeque.addLast(40);
        arrayDeque.addLast(60);
        System.out.println(arrayDeque);
        arrayDeque.pollFirst();
        System.out.println(arrayDeque);
        arrayDeque.pollLast();
        System.out.println(arrayDeque);
    }
}
