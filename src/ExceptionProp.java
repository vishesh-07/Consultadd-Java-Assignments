import java.io.FileNotFoundException;

public class ExceptionProp {
    public static void main(String[] args) {
//        Unchecked uc=new Unchecked();
//        uc.third();
        Checked checked=new Checked();
        checked.third();
        System.out.println("Namaste from Main");
    }
}
class Unchecked{
    void first(){
        int divide=10/0;
    }
    void second(){
        first();
    }
    void third(){
        try {
            second();
        }catch (Exception e){
            System.out.println("Unchecked Handled");
        }
    }
}
class Checked{
    void first() throws FileNotFoundException{
        throw new FileNotFoundException();
    }
    void second() throws FileNotFoundException{
        first();
    }
    void third(){
        try{
            second();
        }catch (Exception e){
            System.out.println("Checked Handled");
        }
    }
}