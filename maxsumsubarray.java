import java.lang.Math;
import java.util.*;
class maxsumsubarray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int a=0,maxele=0;
        for(int j=0;j<n;j++){
            a=0;
            for(int k=j;k<n;k++){
                a=a+arr[k];
                maxele=Math.max(a,maxele);
            }
        }
        System.out.print(maxele);
    }
}
