public class VarArgs {
     static int sum(int ...arr){
         //arr is available as int[] arr;
         int result = 0;
         for (int a : arr){
             result += a;
         }
         return result;
     }

    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5,5));

    }
}
