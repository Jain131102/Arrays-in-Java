import java.util.Arrays;

class ReverseArray{
    public static void reverse(int arr[]){
        int s=0,e=arr.length-1;
        int temp;

        while(s<e){
            temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;

            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[]{0,1,2,3,4,5};

        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}