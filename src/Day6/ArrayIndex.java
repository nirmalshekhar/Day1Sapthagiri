package Day6;
import java.util.Scanner;
public class ArrayIndex {
    static void fetchElement(int[]arr,int index)throws ArrayIndexOutOfBoundsException{
        /*if(index<0||index>=arr.length)
        {
            //throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }
        else{*/
            System.out.println(arr[index]);
        //}
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//size of an Array
        int[] arr=new int[n];//Array Declaration
        System.out.println("Enter Array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int index=sc.nextInt();
        try{
            fetchElement(arr,index);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Caught Exception"+e.getMessage());
        }
        finally{
            System.out.println("FInally block executed");
        }
    }
}
