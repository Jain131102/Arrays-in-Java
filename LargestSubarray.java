class LargestSubarray {
public static void printSubarray(int arr[]){
    for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            for(int k=i;k<=j;k++)
            System.out.print(arr[k]+" ");
            System.out.println();
        }
        System.out.println();
    }
}    
public static int maxSubarraySum(int arr[]){
    int currSum=0,maxSum=Integer.MIN_VALUE;
    //Bruteforce approach 
for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            for(int k=i;k<=j;k++)
            currSum+=arr[k];
            if(currSum>maxSum)
            maxSum=currSum;
        }
    }
    return maxSum;
}   
public static int maxSubarraySum2(int arr[]){
    //Prefix approach -better
    int prefix[]=new int[arr.length];
    prefix[0]=arr[0];
    int currSum=0,maxSum=Integer.MIN_VALUE;

    for(int i=1;i<arr.length;i++)
    prefix[i]=prefix[i-1]+arr[i];

    for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            currSum=i==0?prefix[j]:prefix[j]-prefix[i-1];
            if(currSum>maxSum)
            maxSum=currSum;
        }
    }
    return maxSum;
}
public static int kandanes(int arr[]){
    //Best approach - kadanes algo
    int currSum=0,maxSum=Integer.MIN_VALUE;

    for(int i=0;i<arr.length;i++){
        currSum+=arr[i];

        if(currSum<0)
        currSum=0;
        if(currSum>maxSum)
        maxSum=currSum;
    }
    return maxSum;
}

public static void main(String args[]){
    int arr[]={-1,-2,1,5,-1,6,-6};
        System.out.println("Max subarray sum="+kandanes(arr));
}
}
