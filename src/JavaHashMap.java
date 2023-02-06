import java.util.HashMap;
import java.util.TreeMap;

public class JavaHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String>hashMap=new HashMap<>();
        hashMap.put(1,"Aman");
        hashMap.put(2,"Vikas");
        hashMap.put(4,"Ravi");
        hashMap.put(3,"Tejas");
        System.out.println(hashMap);
        TreeMap<Integer,String> treeMap=new TreeMap<>();
        treeMap.put(1,"Aman");
        treeMap.put(2,"Vikas");
        treeMap.put(4,"Ravi");
        treeMap.put(3,"Tejas");
        System.out.println(treeMap);
    }
}
