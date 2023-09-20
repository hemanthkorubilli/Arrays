import java.util.*;
class freqinsortedarr{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int freq=1,i=1;
        while(i<n){
            while(i<n && arr[i]==arr[i-1]){
                freq=freq+1;
                i++;
            }
            System.out.println(arr[i-1]+" "+freq);
            freq=1;
            i++;
        }
        if(n==1 || arr[n-1]!=arr[n-2]){
            System.out.print(arr[n-1]+" "+1);
        }
    }
}
