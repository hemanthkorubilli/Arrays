import java.util.*;
import java.lang.Math;
class slidingnaiev{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int res=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(int i=0;i<n-1;i++){
            int a=0;
            for(int j=0;j<k;j++){
                a=a+arr[j+i];
            }
            res=Math.max(res,a);

        }
        System.out.print(res);
        
    }
}