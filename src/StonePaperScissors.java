import java.util.Random;
import java.util.Scanner;

public class StonePaperScissors {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Random  r = new Random();
        int comp = 1 + r.nextInt(3);
        int i=1;
        while (i!=0){
            System.out.println("enter number\n 1. Stone\n 2. Paper\n 3.scissor");
            int user = inp.nextInt();
            switch (comp){
                case 1:
                    System.out.println(comp);
                    if(user==1)
                        System.out.println("tie");
                    else if (user==2)
                        System.out.println("you win");
                    else
                        System.out.println("you lose");
                    break;
                case 2:
                    System.out.println(comp);
                    if (user==2)
                        System.out.println("tie");
                    else if (user==3)
                        System.out.println("you win");
                    else
                        System.out.println("you lose");
                    break;
                case 3:
                    System.out.println(comp);
                    if (user==3)
                        System.out.println("tie");
                    else if (user==1)
                        System.out.println("you win");
                    else
                        System.out.println("you lose");
                    break;
            }
            System.out.println("do you want exit press 0");
            i =inp.nextInt();
            comp= 1+ r.nextInt(3);

        }


    }
}
