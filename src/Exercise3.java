import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        // Practice Problem 1
        /* float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of sum is " + sum);

        */
        // Practice Problem 2
        /*
        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float num = 45.57f;
        boolean isInArray = false;
        for(float element:marks){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in the array");
        }
        else{
            System.out.println("The value is not present in the array");
        }
        */
        int [][] arr1 = new int[2][3];
        int [][] arr2 = new int[2][3];
        Scanner s = new Scanner(System.in);
        System.out.println("1st array:");
        for (int i = 0; i< arr1.length; i += 1) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j]=s.nextInt();
            }
        }
        System.out.println("2nd array:");
        for (int i = 0; i< arr2.length; i += 1) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j]=s.nextInt();
            }
        }
        System.out.println("1st array=");
        for (int i=0;i< arr1.length;i++) {
            for (int j = 0; j < arr1[i].length; j++){
                System.out.printf("%d\t",arr1[i][j]);
            }
            System.out.printf("\n");

        }
        System.out.println("2nd array=");
        for (int i=0;i< arr2.length;i++) {
            for (int j = 0; j < arr2[i].length; j++){
                System.out.printf("%d\t",arr2[i][j]);
            }
            System.out.printf("\n");

        }
        System.out.println("sum=");
        for (int i=0;i< arr1.length;i++) {
            for (int j = 0; j < arr1[i].length; j++){
                System.out.printf("%d\t",arr1[i][j]+arr2[i][j]);
            }
            System.out.printf("\n");

        }
        // Practice Problem 6
        int [] arr = {1, 2100, 3, 455, 5, 34, 67};
        int max = Integer.MIN_VALUE;
        for(int e: arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("the value of the maximum element in this array is: "+ max);

        // Practice Problem 6
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        // Practice Problem 7
        boolean isSorted = true;
        int [] a1 = {1, 12, 3, 4, 5, 34, 67};
        for(int i=0;i<a1.length-1;i++){
            if(a1[i] > a1[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }

    }
}
