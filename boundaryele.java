import java.util.*;
class boundaryele{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[5][5];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i==0 || j==0 || i==arr[i].length-1 || j==arr[i].length-1){
                    System.out.print(arr[i][j]+" ");
                }else{
                    continue;
                }
            }
            System.out.print("");
        }
    }
}