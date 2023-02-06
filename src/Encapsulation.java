public class Encapsulation{
    public static void main(String[] args) {
        Temp temp=new Temp();
        temp.setNumber(20);
        System.out.println(temp.getNumber());
    }
}
class Temp{
    private int number;
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
}
