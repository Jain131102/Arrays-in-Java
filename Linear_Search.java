class Linear_Search {
public static int LinearSearch(int arr[],int key){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==key)
        return i;
    }
    return -1;
}    
public static void main(String args[]){
    int arr[]={1,9,4,2,0,8,-2,8,7};
    System.out.println(LinearSearch(arr,0));
}
}
