import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter the year ");
        int year = inp.nextInt();
        if (year%4==0||year%400==0){
            System.out.println("leap year");
        }
        else {
            System.out.println("not leap year");
        }
    }
}
