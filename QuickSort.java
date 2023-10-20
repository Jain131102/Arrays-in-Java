import java.util.Arrays;

class QuickSort {
    public static void quicksort(int arr[],int si,int ei){
        if(si<ei){
        int pvt=partition(arr,si,ei);
        quicksort(arr, si, pvt-1);
        quicksort(arr, pvt+1, ei);
    }
}
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei],i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;

        return i;
    }
    public static void main(String[] args) {
        int arr[]={1,2,6,5,8,0,9};
        System.out.println(Arrays.toString(arr));
        quicksort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
