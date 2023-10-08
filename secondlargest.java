import java.util.*;
class secondlargest{
    public static void main(String args[]){
        int arr[]={1,23,45,34,67,4};
        Arrays.sort(arr);
        System.out.print(arr[arr.length-2]);

    }
}