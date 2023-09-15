class SecondMaxMin{
    public static void SLargest(int arr[]){
        int max=arr[0],smax=-1;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
            {
                smax=max;
                max=arr[i];
            }
            else if(arr[i]<max && arr[i]>smax ){
                smax=arr[i];
            }
        }
       System.out.println("Largest="+max+"\nSecond Largest="+smax);
    }
    public static void SSmallest(int arr[]){
        int min=arr[0],smin=Integer.MAX_VALUE;

        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                smin=min;
                min=arr[i];
            }
            else if(arr[i]!=min && arr[i]<smin){
                smin=arr[i];
            }
        }
        System.out.println("Smallest="+min+"\nSecond Smallest="+smin);
    }
    public static void main(String args[]){
        int arr[]={5,10,13,75,99,124,1,-77};
        SLargest(arr);
        SSmallest(arr);
    }
}