import java.util.Arrays;

class Bubble_Sort {
    public static void BubbleSort(int arr[]){
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String args[]){
        int arr[]={1,9,6,3,0,-1,5,2,99,-6,222};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
