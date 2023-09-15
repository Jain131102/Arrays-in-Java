import java.util.Arrays;

class PairSum {
    public static int LinearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)
            return i;
        }
        return -1;
    }    
    public static void sum(int arr[],int target){
        int a[]=new int[2];
        for(int i=0;i<arr.length;i++){

            int k=LinearSearch(arr,target-arr[i]);
            if(k!=-1)
            {
                a[0]=arr[i];
                a[1]=arr[k];
                System.out.println(Arrays.toString(a));
            }
        }
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,9,-1,6,5};
        sum(arr, 8);

    }
}
