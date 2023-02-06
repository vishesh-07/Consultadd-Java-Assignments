public class Abstraction {
    public static void main(String[] args) {
//        AbstractChild abstractChild=new AbstractChild();
//        abstractChild.hello();
        Class cls=new Class();
        cls.show();
    }
}
abstract class Abstract{
    void hello(){
        System.out.println("Hello from Parent");
    }
    abstract void hi();
}
class AbstractChild extends Abstract{

    @Override
    void hi() {
        System.out.println("Hi from Child");
    }
    void hello(){
        super.hello();
        System.out.println("Hello from Child");
    }
}

interface Interface{
    void show();
}
class Class implements Interface{
    @Override
    public void show() {
        System.out.println("Child Show");
    }
}