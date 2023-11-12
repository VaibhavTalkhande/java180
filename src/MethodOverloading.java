public class MethodOverloading {
    static int add(int a, int b){
        return a+b;
    }
    static  int add(int a ,int b ,int c){
        return  a+b+c;
    }
    void print(String s){
        System.out.println(s);
    }
    void print(char a, char b){
        System.out.println(a+"aibha"+b);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.print("vaibhav");
        obj.print('V','v');
        System.out.println(add(2,5));
        System.out.println(add(3,5,8));
    }
}
