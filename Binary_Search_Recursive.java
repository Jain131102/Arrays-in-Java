class Binary_Search_Recursive {
public static int BinarySearch(int arr[],int s,int e,int key){
    if(s<=e)
    {
        int mid=(s+e)/2;
        if(arr[mid]==key)
        return mid;
        else if(arr[mid]<key)
        BinarySearch(arr,mid+1,e,key);
        else
        BinarySearch(arr,s,mid-1,key);
    }
  else
    return -1;
}    

public static void main(String args[]){
    int arr[]={1,2,3,4,5,6,7,8,9,10};
    System.out.println(BinarySearch(arr,0,arr.length-1,5));
}
}
