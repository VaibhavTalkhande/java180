public class MergeSort {
    public static void mergeSort(int[] arr,int low,int high){
        if(low<high){
            int mid = (low+high)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }

    public  static  void merge(int[] arr,int low,int mid,int high){
        int[] temp= new int[high+1];
        int left=low;
        int right=mid+1;
        int k=left;
        while(left<=mid&&right<=high){
            if(arr[left]<=arr[right]){
                temp[k]=arr[left];
                left++;
            }
            else{
                temp[k]=arr[right];
                right++;
            }
            k++;
        }
        if(left>mid){
            while(right<=high){
                temp[k]=arr[right];
                right++;
                k++;
            }
        }
        if(right>high){
            while(left<=mid){
                temp[k]=arr[left];
                left++;
                k++;
            }
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 21, 3, 4, 5, 34, 67};
        mergeSort(arr,0,arr.length-1);
        for (int x: arr
        ) {
            System.out.println(x);
        }
    }
}
