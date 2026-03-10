package Day7;
import java.util.Scanner;
public class MajorityElement {
    public static int majority(int []arr){
        int count=0;
        int candidate=0;
        for(int num:arr){
            if(count==0){
                candidate=num;
            }
            if(num== candidate){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Majority Element :"+majority(arr));
    }
}
