
import java.util.Scanner;
public class AddThreeSum {
    public static void main(String[] args){
        Scanner input_value = new Scanner(System.in);
        int answer=0;

        for (int i = 0; i < 3; i++) {
            System.out.printf("Enter the "+(i+1)+"st  value:");
            answer+= input_value.nextInt();

        }
        System.out.println("your answer:"+ answer);
    }


}
