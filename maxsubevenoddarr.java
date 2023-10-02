import java.util.*;
import java.lang.Math;
class maxsubevenoddarr{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res=1,curr=1;
        for(int i=1;i<n;i++){
            if((arr[i]%2==0 && arr[i-1]%2!=0)||(arr[i]%2!=0 && arr[i-1]%2==0)){
                curr++;
                res=Math.max(res,curr);
            }else{
                curr=1;
            }
        }
        System.out.print(res);
    }
}