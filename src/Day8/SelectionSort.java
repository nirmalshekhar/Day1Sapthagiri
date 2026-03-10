package Day8;
import java.util.Arrays;
public class SelectionSort {
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int minIndx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndx]){
                    minIndx=j;
                }
            }
            int temp=arr[minIndx];
            arr[minIndx]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        int []arr={64,25,12,22,11};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
