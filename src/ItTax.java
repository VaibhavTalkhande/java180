import java.util.Scanner;

public class ItTax {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("choose your income range\n\t1. 2.5l-5l\n\t2. 5l-10l\n\t 3. 10l++\n enter the choice from 1/2/3:");
        int choice = inp.nextInt();
        System.out.println("enter income");
        int income = inp.nextInt();
        float tax;
        switch (choice){
            case  1 :
                tax=(float) 5/100*income;
                System.out.println("your tax amount is "+tax);
                break;

            case  2 :
                tax=(float) 20/100*income;
                System.out.println("your tax amount is "+tax);
                break;
            case 3 :
                tax=(float) 30/100*income;
                System.out.println("your tax amount is "+tax);
            break;
            default : System.out.println("invalid choice");
        }
    }
}
