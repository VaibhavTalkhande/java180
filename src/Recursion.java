public class Recursion {
    static void rec1(int n){
        if(n>0){
            rec1(n-1);
            System.out.println(n);
        }
    }
    static  void rec1Not(int n){
        for (int i =1;i<=n;i++)
            System.out.println(i);
    }
    static void rec2(int n){
        if (n>0){
            System.out.println(n);
            rec2(n-1);
        }
    }
    static  void rec2Not(int n){
        for (int i =n;i>0;i--)
            System.out.println(i);
    }
    static int factRec(int n){
        int output=1;
        if(n>1){
            output=n*factRec(n-1);
        }
        else if (n==0||n==1){
            return 1;
        }
        System.out.println("factorial of "+n+ " "+"is "+output );
        return output;
        //code with harry;
//        if(n==0 || n==1){
//            return 1;
//        }
//        else{
//            return n * factorial(n-1);
//        }
    }
    static void factorial(int n){
        int output= 1;
        for (int i = 2; i <=n; i++) {
            output *=i;
        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        rec1(5);
        rec2(3);
        factRec(5);
        // without recursion;
        rec1Not(5);
        rec2Not(3);
        factorial(5);

    }
}
