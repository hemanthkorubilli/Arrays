import java.util.*;
class isarraysorted{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int a=0;
        for(int i=1;i<n;i++){
            if(arr[i-1]<arr[i]){
                 a=1;
            }
        }
        if(a==0){
            System.out.print("not sorted");
        }else{
            System.out.print("sorted");
        }
    }
}