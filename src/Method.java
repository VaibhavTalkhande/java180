public class Method {
    static int logic(int x,int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else {
            z=(x+y)*5;

        }
        x =566;
        return z;
    }
    int sum(int x,int y){
        return x+y;
    }
    public  static  void main(String[] args){
        int a =5;
        int b=7;
        int c;
        //Method invocation using Obect creation
        //Method obj = new Method();
        //c=obj.logic(a,b);
        c= logic(a,b);
        System.out.println(a+" + "+b);
        int a1=2;
        int b1=1;
        int c1;
        Method p = new Method();
        int  d= p.sum(5,6);
        System.out.println(d);
        c1= logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);


    }
}
