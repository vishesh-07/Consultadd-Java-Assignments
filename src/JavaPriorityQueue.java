import java.util.PriorityQueue;

public class JavaPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer>priorityQueue=new PriorityQueue<>();
        priorityQueue.add(2);
        priorityQueue.add(1);
        priorityQueue.add(5);
        priorityQueue.add(4);
        priorityQueue.add(3);
        System.out.println(priorityQueue);
        priorityQueue.poll();
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());
    }
}
