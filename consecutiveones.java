import java.util.*;
import java.lang.Math;
class consecutiveones{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res=0,curr=0;
        int a=arr.length;
        for(int i=0;i<a;i++){
            if(arr[i]==0){
                curr=0;
            }else{
                curr++;
                res=Math.max(curr,res);
            }
        }
        System.out.print(res);
    }
}