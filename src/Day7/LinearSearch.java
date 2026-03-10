package Day7;
public class LinearSearch {
    public static int linaersearch(int[]arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
        int target = 70;
        int result = linaersearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index :" + result);
        } else {
            System.out.println("NOT FOUND");
        }
    }
}
