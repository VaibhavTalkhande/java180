public class RecEx {
    static void table(int n,int i){
       if (i>10) return;
       System.out.println(n*i);
       table(n,i+1);
    }
    static void pattern(int n){
        for(int i=0;i<n;i++){
            for (int j = 0; j <i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    static void revPattern(int n){
        for(int i=1;i<n+1;i++){
            for (int j =1; j<=(n-i+1) ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    static void patternRec(int n){
        if (n==0){
            //System.out.println("*");
            return;
        }
        patternRec(n-1);
            for (int j = 0; j <n ; j++) {
                System.out.print("*");


            }
            System.out.println();
    }
    static void patternReV(int n){
        if (n==0){
           // System.out.println("*");
            return;
        }
        for (int j = 0; j <n ; j++) {
            System.out.print("*");


        }
        System.out.println();
        patternReV(n-1);

    }
    static  int sumRec(int n){
        if(n==0){
            return 0;
        }
        return n+sumRec(n-1);
    }
    static  int avg(int ...a){
        int z=0;
        for(int x:a){
            z +=x;
        }
        return z/ a.length;
    }
    static int fibbo(int n){
        if(n==1||n==2){
            return n-1;
        }else return fibbo(n - 1) + fibbo(n - 2);
    }
    public static void main(String[] args) {
        table(5,1);
        pattern(5);
        revPattern(5);
        patternRec(3);
        patternReV(3);
        System.out.println(sumRec(10));
        System.out.println(avg(2,3,3,5,7,10));
        System.out.println(fibbo(10));
    }
}
