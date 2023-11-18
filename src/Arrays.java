import java.util.Scanner;
import FirstPackage.Welcome;
public class Arrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] mark; //Declaration!
        mark = new int[5];//memory allocation
        int [] marks = new int[5];//declaration+memory allocation;
        marks[0]=1;//initialize
        marks[1]=2;
        marks[2]=3;
        marks[3]=4;
        marks[4]=5;
        int [] a = {1,2,3,4,5};//declare +initialize
        for (int x:a) {
            System.out.println(x);

        }
        for (int x: marks) {
            System.out.println(x);
        }
        for (int x=0;x< mark.length;x++
             ) {
            System.out.println("enter a value");
            mark[x]=s.nextInt();

        }
        for (int x: mark
             ) {
            System.out.println(x);

        }
        Welcome n = new Welcome();
        n.show();



    }
}
