import java.util.*;
class maxsubarraysum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        int temp=0;
        for(int i=0;i<n;i++){
         temp=0;
            for(int j=i;j<n;j++){
                temp=temp+arr[j];
                if(temp>max){
                    max=temp;
                }
            }
        }
        System.out.println(max);
    }
}