public class day1 {
    // Write a program to print the following pattern:
    // 4444444
    // 4333334
    // 4322234
    // 4321234
    // 4322234
    // 4333334
    // 4444444
    public static void invertedRightTriangle(int n){
        for(int i=1;i<n;i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
    public static void rightTriangle(int n){
        for(int i=1;i<n;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    public static  void hollowDiamond(int n){
        int space=0;
        for(int i=0;i<n;i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n-i; j++) {
                System.out.print("*");
            }
            space+=2;
            System.out.println();
        }
        space=2*n-2;
        for(int i=1;i<=n;i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <space; j++) {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++) {
                System.out.print("*");

            }

            space-=2;
            System.out.println();
        }



    }
    public static void getNumberPattern(int n) {
        // Write your code here.
        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; j < 2*n-1; j++) {
                int top =i ,bottom=j,left=(2*n-2)-i,right=(2*n-2)-j;
                int minValue = Math.min(Math.min(top, bottom), Math.min(left,right));
                System.out.printf("%d",(n - minValue));
            }
            System.out.println();
        }
    }

    public static void selectionSort(int[] arr) {
        //Your code goes here
        int temp;
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if(min!=i){
                temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }

        }
    }
    public static void  bubbleSort(int[] arr){
        int temp=0;
        int n = arr.length;
        for (int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void insertionSort(int[] arr,int size){
        int temp=0;
        for(int i=0;i<size;i++){
            int j= i;
                while(j>0&&arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    j--;
                }

        }
    }
    public static void main(String[] args) {
        getNumberPattern(5);
        getNumberPattern(3);
        hollowDiamond(3);
        hollowDiamond(5);
        rightTriangle(3);
        invertedRightTriangle(3);
        int [] arr = {1, 21, 3, 4, 5, 34, 67};
        System.out.printf("before sorting\n");
        for (int x: arr
        ) {
            System.out.print(x+" ");
        }
        selectionSort(arr);
        System.out.printf("after selection sorting\n");
        for (int x: arr
        ) {
            System.out.print(x+" ");
        }
        System.out.println();
        int [] arr1 = {1, 21, 3, 4, 5, 34, 67};
        System.out.printf("before sorting\n");
        for (int x: arr1
        ) {
            System.out.print(x+" ");
        }
        bubbleSort(arr1);
        System.out.printf("after bubble sorting\n");
        for (int x: arr1
        ) {
            System.out.print(x+" ");
        }
        System.out.println();
        int [] arr2 = {2,13,4,1,3,6,28};
        System.out.printf("before sorting\n");
        for (int x: arr2
        ) {
            System.out.print(x+" ");
        }
        insertionSort(arr2,arr2.length);
        System.out.printf("after insertion sorting\n");
        for (int x: arr2
        ) {
            System.out.print(x+" ");
        }



    }
}
