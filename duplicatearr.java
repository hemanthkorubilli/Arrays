import java.util.*;
class duplicatearr{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(fun(arr,n));
    }
    static int fun(int arr[],int n){
        int res=1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[res-1]){
                arr[res]=arr[i];
                res++;
            }
        }
        return res;
    }
}