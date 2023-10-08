import java.util.*;
class removeduplicateinarr{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        funremove(arr,n);
    }
    static void funremove(int arr[],int n){
        int res=1;
        for(int i=1;i<n;i++){
            if(arr[res-1]!=arr[i]){
                arr[res]=arr[i];
                res++;
            }
        }
        for(int i=0;i<res;i++){
            System.out.print(arr[i]+" ");
        }
    }
}