import java.util.Scanner;

public class InputType {
    public static void main(String[] args){

        System.out.print("enter a value to check type");
        Scanner sc = new Scanner(System.in);
//        int val1= sc.nextInt();
        System.out.println(sc.hasNextInt());
    }
}
