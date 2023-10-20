import java.util.Arrays;

class MergeSort {

    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int k=0,i=si,j=mid+1;

        while(i<=mid && j<=ei)
        {
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid)
            temp[k++]=arr[i++];
        
        while(j<=ei)
            temp[k++]=arr[j++];
        
        for(k=0,i=si;k<temp.length;k++,i++)
            arr[i]=temp[k];
    }

    public static void mergesort(int arr[],int si,int ei){
        if(si>=ei)
        return;

        int mid=(si+ei)/2;
        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);
        merge(arr, si,mid,ei);
    }

    public static void main(String[] args) {
        int arr[]={5,4,3,2,1,0};
        System.out.println(Arrays.toString(arr));
        mergesort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
