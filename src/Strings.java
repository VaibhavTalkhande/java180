import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        char[] str = { 'a','b','a','c','u','s'};
        String a1 = new String(str);
        String a2 = "abacus";
        String a3 = "abacus";
        String s = new String("anrry");
        System.out.println("using object:"+a1);
        System.out.println("literal:"+a2);
        System.out.println("new object"+s);
        System.out.println(a1.equals(a2));
        System.out.println(a3.equals(a2));
        //  %d for int
        //  %f for float
        //  %c for char
        //  %s for string
        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is %8.2f", a, b);
        Scanner sc = new Scanner(System.in);
       // String stir = sc.next();//hi jo
        //System.out.println(stir);//hi
        System.out.println("next inp");//hi jo
        String st = sc.nextLine();//hi jo
        System.out.println(st);
    }
}
