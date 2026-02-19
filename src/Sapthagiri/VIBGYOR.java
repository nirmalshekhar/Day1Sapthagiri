package Sapthagiri;
import java.util.Scanner;
public class VIBGYOR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        ch=Character.toUpperCase(ch);
        String color;
        switch(ch){
            case 'V':
                color="Violet";
                break;
            case 'I':
                color="Indigo";
                break;
            case 'B':
                color="Blue";
            default:
                color="Invalid Input";
        }
        System.out.println("Color ="+color);
    }
}
