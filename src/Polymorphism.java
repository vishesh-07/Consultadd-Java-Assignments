public class Polymorphism {
    public static void main(String[] args) {
//        Demo demo=new Demo();
//        System.out.println(demo.add(3,4));
//        System.out.println(demo.add(3,4,5));
        Bike bike=new Bike();
        bike.print();
    }
}
class Demo{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}

class Vehicle{
    void print(){
        System.out.println("Vehicle Called");
    }
}
class Bike extends Vehicle{
    @Override
    void print() {
        super.print();
        System.out.println("Bike Called");
    }
}