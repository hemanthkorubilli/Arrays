import java.util.*;
class movezerostoend{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        movezerostolast(arr,n);
    }
    static void movezerostolast(int arr[],int n){
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
        }
        for(int i=count;i<n;i++){
            arr[i]=0;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}