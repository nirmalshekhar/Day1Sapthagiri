package Day7;
import java.util.*;
import java.util.Scanner;
public class MoveZeroSwap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index++]=temp;

            }
        }
        //System.out.println(Arrays.toString(arr));
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
