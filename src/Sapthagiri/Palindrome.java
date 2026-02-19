package Sapthagiri;

public class Palindrome {
    public static void main(String[] args) {
        int n=121;
        int original=n;
        int rev=0;
        while(n>0)
        {
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        if(rev==original){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
