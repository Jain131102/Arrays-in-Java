class Binary_Search {
public static int BinarySearch(int arr[],int key){
    int s=0,e=arr.length-1;
    while(s<e)
    {
        int mid=(s+e)/2;
        if(arr[mid]==key)
        return mid;
        else if(arr[mid]<key)
        s=mid+1;
        else
        e=mid-1;
    }
    return -1;
}    

public static void main(String args[]){
    int arr[]={1,2,3,4,5,6,7,8,9,10};
    System.out.println(BinarySearch(arr, 5));
}
}
