import java.util.Scanner;

public class FlowControl {
    public static void main(String[] args) {
        int random=(int)(Math.random()*50+1);
        System.out.println(random);
        Scanner sc=new Scanner(System.in);
        int chance=5;
        System.out.println("Guess a number between 1 and 50 inclusive.");
        while(chance>0){
            int n=sc.nextInt();
            if(n==random){
                System.out.println("You Won\nYou Guessed the right number.");
                break;
            }else if(n<random && chance>1){
                System.out.println("Guess a bigger number");
            }else if(n>random && chance>1){
                System.out.println("Guess a smaller number");
            }
            chance--;
            if(chance>1){
                System.out.println("You have " + chance + " chances left");
            }
        }
        if(chance==0){
            System.out.println("You Lost\nCorrect number was "+random);
        }
    }
}
