import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JavaArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre size of array");
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter the element\t");
            int ele=sc.nextInt();
            arrayList.add(ele);
        }
        System.out.println("For loop");
        for(int i=0;i<n;i++) {
            System.out.print(arrayList.get(i) + "\t");
        }
        System.out.println("\nFor Each");
        for(int i:arrayList){
            System.out.print(i+"\t");
        }
        System.out.println("\nIterator");
        Iterator<Integer>iterator=arrayList.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+"\t");
        }
        arrayList.add(1,100);
        System.out.println(arrayList);
        arrayList.remove(2);
        System.out.println(arrayList);
    }
}
