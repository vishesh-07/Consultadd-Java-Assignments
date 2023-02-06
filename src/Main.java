public class Main {
    public static void main(String[] args){
        Child child=new Child();
        child.func();
    }
}
interface Parent1{
    void func();
}
interface Parent2{
    void func();
}
class Child implements Parent1,Parent2 {
    public void func(){
        System.out.println("Child Called");
    }
}