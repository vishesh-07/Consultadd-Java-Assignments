import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class JavaHashSet {
    public static void main(String[] args) {
        HashSet<Integer>hashSet=new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(1);
        System.out.println(hashSet);
        LinkedHashSet<Integer>linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(1);
        System.out.println(linkedHashSet);
        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(1);
        System.out.println(treeSet);
    }
}
