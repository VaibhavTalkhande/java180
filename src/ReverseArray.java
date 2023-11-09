public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {1, 21, 3, 4, 5, 34, 67};
        int l = arr.length;
        int n = Math.floorDiv(l,2);//l/2=n
        int temp;
        for (int i = 0; i <n ; i++) {
            temp= arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
        }
        for (int x: arr
             ) {
            System.out.println(x);
        }
    }
}
