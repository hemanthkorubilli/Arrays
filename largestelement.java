import java.util.*;
class largestelement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res=0;
        for(int i=0;i<n;i++){
            if(arr[i]>res){
                res=arr[i];
            }
        }
        System.out.print(res);
    }
}