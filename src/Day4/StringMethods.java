package Day4;
import java.sql.SQLOutput;
import java.util.Scanner;
public class StringMethods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String input=sc.nextLine();
        //1.length()
        System.out.println("Lenght :" +input.length());
        //2.toUpperCase()
        System.out.println("Uppercase : "+input.toUpperCase());
        //3.toLowerCase()
        System.out.println("LowerCase :"+input.toLowerCase());
        //4.charAt(index)
        System.out.println(input.charAt(2));
        //5.substring(begin,end)
        System.out.println(input.substring(0,4));
        //6.concat  or '+'
        String str="Cannon Bolt ";
        System.out.println("concat : "+input.concat(str));
        System.out.println(input+str);

        //7.equals()
        System.out.println(input.equals("Ben 10"));
        //8.equalsIgnoreCase()
        System.out.println(input.equalsIgnoreCase("ben 10"));
        //9.replace(old,new)
        System.out.println(input.replace("10","Ten"));
        //10.trim()
        String spaced =" "+input+" ";
        System.out.println("Trimmed"+spaced.trim());
        //11.startsWith()
        System.out.println(input.startsWith("B"));
        //12.endsWith()
        System.out.println(input.endsWith("n"));
        //13.indexOf()
        System.out.println(input.indexOf('e'));
        //14.compareTo()
        System.out.println(input.compareTo("Ben 10"));
        //15.split()
        String []words=input.split(" ");
        for(String word:words){
            System.out.println(word);
        }
        //16.isLetter() and 17.isDigit()
        for (int i=0;i<input.length();i++){
            char c=input.charAt(i);
            if(Character.isLetter(c)){
                System.out.println("Is letter");
            } else if (Character.isDigit(c)) {
                System.out.println("its a digit");
            }
            else{
                System.out.println("Nor a letter nor a digit");
            }
        }
    }
}
