import java.util.*;

public class JavaLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList= new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre size of array");
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter the element\t");
            int ele=sc.nextInt();
            linkedList.add(ele);
        }
        System.out.println("For loop");
        for(int i=0;i<n;i++) {
            System.out.print(linkedList.get(i) + "\t");
        }
        System.out.println("\nFor Each");
        for(int i:linkedList){
            System.out.print(i+"\t");
        }
        System.out.println("\nIterator");
        Iterator<Integer> iterator=linkedList.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+"\t");
        }
        linkedList.add(1,100);
        System.out.println(linkedList);
        linkedList.remove(2);
        System.out.println(linkedList);
    }
}
